import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<File> files = new ArrayList<>();

        System.out.print("Type the name of the folder: ");
        Directory directory = new Directory(files, scanner.next());
        System.out.println("Folder '" + directory.getName() + "' has been created.");

        //Let's add one audio file
        directory.getFiles().add(new AudioFile("ACDC-C.O.D", "mp3"));
        directory.getFiles().get(directory.getFiles().size() - 1).setContents(someString());

        //Add some text files
        for (int i = 1; i <= 5; i++) {
            while (true) {
                int fileNumber = (int) (Math.random() * 49 + 1);    //To create files #1...50
                String type = "doc";
                if (fileExistCheck(directory.getFiles(), "File_#" + fileNumber, type)) {
                    directory.getFiles().add(new AudioFile("File_#" + fileNumber, type));

                    //Let's add some content
                    directory.getFiles().get(directory.getFiles().size() - 1).setContents(someString());
                    break;
                }
            }
        }

        //Let's add few photographic files
        for (int i = 1; i <= 5; i++) {
            while (true) {
                int fileNumber = (int) (Math.random() * 49 + 1);    //To create files #1...50
                String type = "jpg";
                if (fileExistCheck(directory.getFiles(), "File_#" + fileNumber, type)) {
                    directory.getFiles().add(new AudioFile("File_#" + fileNumber, type));

                    //Let's add some content
                    directory.getFiles().get(directory.getFiles().size() - 1).setContents(someString());
                    break;
                }
            }
        }

        //Let's print file list as we has it now
        FileListPrint.printFileList(directory);

        //User's interface
        while (true) {
            System.out.print("Do you want to '(s)ort' it or to 'en(c)rypt'/'decrypt' a file? Type 'e(x)it' to exit: ");
            String command = scanner.next();
            if (command.equals("x") || command.equals("e") || command.equals("exit")) {
                break;
            }

            //If sort is selected
            if (command.equals("s") || command.equals("sort")) {
                while (true) {
                    System.out.print("Which way do you want to sort it? Type '(n)ame', '(t)ype', ");
                    System.out.print("'(s)ize' or '(r)eturn' to back to a previous menu: ");
                    command = scanner.next();
                    if (command.equals("r") || command.equals("return")) {
                        break;
                    }

                    if (command.equals("n") || command.equals("name")) {
                        FileSort.byName(directory.getFiles());
                        FileListPrint.printFileList(directory);
                    }

                    if (command.equals("t") || command.equals("type")) {
                        FileSort.byType(directory.getFiles());
                        FileListPrint.printFileList(directory);
                    }

                    if (command.equals("s") || command.equals("size")) {
                        FileSort.bySize(directory.getFiles());
                        FileListPrint.printFileList(directory);
                    }
                }
            }

            //If encrypt is selected
            if (command.equals("c") || command.equals("encrypt") || command.equals("decrypt")) {
                while (true) {
                    System.out.print("Which file you want to encrypt? Type number or '(r)eturn' to back to a previous menu: ");
                    command = scanner.next();
                    if (command.equals("r") || command.equals("return")) {
                        break;
                    }
                    try {
                        int fileNumberToEncrypt = Integer.parseInt(command) - 1;
                        directory.getFiles().get(fileNumberToEncrypt).setName(EncryptUtils.encryptByCaesar(directory.getFiles().get(fileNumberToEncrypt).getName(), directory.getFiles().get(fileNumberToEncrypt).isEncrypted));
                        //Let's change a flag 'encrypted'
                        if (directory.getFiles().get(fileNumberToEncrypt).isEncrypted) {
                            directory.getFiles().get(fileNumberToEncrypt).isEncrypted = false;
                        } else {
                            directory.getFiles().get(fileNumberToEncrypt).isEncrypted = true;
                        }

                        //Let's print new file list
                        FileListPrint.printFileList(directory);
                    } catch (IllegalArgumentException e) {
                        System.out.println("You entered a wrong command!");
                    }
                }
            }
        }
    }

    //This method checks if file with such name and type exists
    private static boolean fileExistCheck(List<File> files, String fileName, String fileType) {
        boolean checker = true; //True when file with such name and type was found
        for (File file : files) {
            if (file.getName().equals(fileName) && file.getType().equals(fileType)) {
                checker = false;
                break;
            }
        }
        return checker;
    }

    //This method returns random length string with random content
    private static String someString() {
        String string = "";
        int length = (int) (Math.random() * 512);
        for (int i = 0; i <= length; i++) {
            char generatedChar = (char) (Math.random() * 65535);
            string += generatedChar;
        }
        return string;
    }


}