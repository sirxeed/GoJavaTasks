import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Start {
    public static void main(String[] args) {
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
                while (true) {
                    try {
                        contents = opening();
                        break;
                    } catch (IOException ex) {
                        System.out.println("File not exist. Try again: ");
                    }
                }
            }

            //If user wants to save 'contents' to a file
            if (userInput.equals("s")) {
                while (true) {
                    try {
                        saving(contents);
                        break;
                    } catch (IOException ex) {
                        System.out.println("Can't save to this file: ");
                    }
                }
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
            System.out.println(content);
        }
    }

    private static void saving(List<String> contents) throws IOException {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;

        System.out.print("Enter a file name to save or (c)ancel: ");
        userInput = scanner.next();
        fileWriter = new FileWriter(userInput);
        if (!userInput.equals("c")) {
            try {
                for (int i = 0; i < contents.size(); i++) {
                    fileWriter.write(EncryptUtils.encryptByCaesar(contents.get(i), false));
                    fileWriter.write(System.lineSeparator());
                }
            } finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
        }
    }

    private static void editing(List<String> contents) {
        Scanner scanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Do you want to add a string? ");
            userInput = scanner.next();
            if (userInput.equals("y") || userInput.equals("yes")) {
                System.out.print("> ");
                contents.add(textScanner.nextLine());
            }

            if (userInput.equals("n") || userInput.equals("no")) {
                break;
            }
        }
    }

    private static List<String> opening() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> contents = new ArrayList<>();

        System.out.print("Enter the file name to open or (c)ancel: ");
        String userInput = scanner.next();
        if (!userInput.equals("c")) {

            //Open a file
            FileReader fileReader = new FileReader(userInput);
            try {
                Scanner fileScanner = new Scanner(fileReader);
                while (fileScanner.hasNext()) {
                    contents.add(EncryptUtils.encryptByCaesar(fileScanner.nextLine(), true));
                }

            } finally {
                if (fileReader != null) {
                    fileReader.close();
                }
            }
        }
        return contents;
    }
}