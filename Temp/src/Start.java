import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Start {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        FileWriter fileWriter = null;
        List<String> contents = new ArrayList<>();

        /*
        while (true) {
            System.out.print("Do you want to add new string? ");
            userInput = scanner.nextLine();
            if (userInput.equals("y")) {
                System.out.print("> ");
                contents.add(EncryptUtils.encryptByCaesar(scanner.nextLine(), false));
                System.out.println("OK");
            } else if(userInput.equals("n")) {
                for (String c : contents) {
                    System.out.println(c);
                }
                break;
            }
        }
        */

        while (true) {
            System.out.print("Do you want to add a string? ");
            userInput = scanner.next();

            //If user wants to save 'contents' to a file
            if (userInput.equals("no") || userInput.equals("n")) {
                System.out.print("Enter a file name: ");
                try {
                    userInput = scanner.next();
                    fileWriter = new FileWriter(userInput);
                    for (int i = 0; i < contents.size(); i++) {
                        fileWriter.write(contents.get(i));
                        fileWriter.write("\n");
                    }
                } finally {
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                }
                break;
            } else if (userInput.equals("yes") || userInput.equals("y")) { //If user wants to add a string to contents
                while (true) {
                    System.out.print("Do you want to add new string? ");
                    userInput = scanner.nextLine();
                    if (userInput.equals("y")) {
                        System.out.print("> ");
                        contents.add(EncryptUtils.encryptByCaesar(scanner.nextLine(), false));
                        System.out.println("OK");
                    } else if(userInput.equals("n")) {
                        for (String c : contents) {
                            System.out.println(c);
                        }
                        break;
                    }
                }
            } else {
                System.out.println("You entered a wrong command!");
            }

        }
    }
}