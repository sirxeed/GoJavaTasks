import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number or 'exit': ");
            String string = scanner.next();

            if (string.equals("exit") || string.equals("Exit")) {
                break;
            }

            try {
                System.out.println("The numeric value is: " + Parse.ParseStringToInt(string));
            } catch (IllegalCharException e) {
                System.out.println("Only digits or 'exit' are allowed!");
            }
        }
    }
}
