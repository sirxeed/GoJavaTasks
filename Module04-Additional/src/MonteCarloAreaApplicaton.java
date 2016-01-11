import java.util.Scanner;

/**
 * Created by Andy on 05.01.2016.
 */
public class MonteCarloAreaApplicaton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter precision: ");
        int precision = scanner.nextInt();
        System.out.print("Enter vertical line limit: ");
        double verticalLimit = scanner.nextDouble();

        System.out.print("Area is: " + Integration.monteCarloParabolic(precision, verticalLimit));
    }
}