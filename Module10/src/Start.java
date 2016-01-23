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
        List<String> contents = new ArrayList<>();

        while (true) {
            System.out.print("Do you want to (o)pen file, (s)ave file, (e)dit content or (p)rint content? Type e(x)it to close the program: ");
            userInput = scanner.next();
            if (userInput.equals("x") || userInput.equals("exit")) {
                break;
            }

            //If user wants to open a file
            if (userInput.equals("o")) {
                contents = opening();
            }

            //If user wants to save 'contents' to a file
            if (userInput.equals("s")) {
                saving(contents);
            }

            //If user wants to add 'contents' to a file
            if (userInput.equals("e")) {
                editing(contents);
            }

            //If user wants to print the 'contents'
            if (userInput.equals("p")) {
                print(contents);
            }
        }
    }

    private static void print(List<String> contents) {
        for (String content : contents) {
            System.out.println(EncryptUtils.encryptByCaesar(content, true));
        }
    }

    private static void saving(List<String> contents) throws IOException {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;

        System.out.print("Enter a file name: ");
        try {
            userInput = scanner.next();
            fileWriter = new FileWriter(userInput);
            for (int i = 0; i < contents.size(); i++) {
                fileWriter.write(contents.get(i));
                fileWriter.write(System.lineSeparator());
            }
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    private static void editing(List<String> contents) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Do you want to add a string? ");
            userInput = scanner.next();

            if (userInput.equals("y") || userInput.equals("yes")) {
                System.out.print("> ");
                contents.add(scanner.nextLine());
            }

            if (userInput.equals("n") || userInput.equals("no")) {
                break;
            }
        }
    }

    private static List<String> opening() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> contents = new ArrayList<>();

        System.out.print("Enter the file name: ");
        String userInput = scanner.next();
        if (!userInput.equals("")) {

            //Open a file
            FileReader fileReader = new FileReader(userInput);
            try {
                Scanner fileScanner = new Scanner(fileReader);
                while (fileScanner.hasNext()) {
                    contents.add(fileScanner.nextLine());
                }

            } finally {
                if (fileReader != null) {
                    fileReader.close();
                }
            }
        } else {
            System.out.print("You must enter the file name! ");
        }
        return contents;
    }
}