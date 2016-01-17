import java.util.Scanner;

public class MonteCarloAreaApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter precision: ");
        float precision = scanner.nextFloat();
        System.out.print("Enter left border: ");
        float a = scanner.nextFloat();
        System.out.print("Enter right border: ");
        float b = scanner.nextFloat();

        System.out.print("Area is: " + Integration.monteCarlo(a, b, precision));
    }
}