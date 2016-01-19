import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<File> files = new ArrayList<>();

        System.out.print("Type the name of the folder: ");
        Directory directory = new Directory(files, scanner.next());
        System.out.println("Folder '" + directory.getName()+ "' has been created.");

        //Let's add one audio file
        directory.getFiles().add(new AudioFile("Pink Floyd - Another Brick in the Wall (Part 2)", "mp3"));
        directory.getFiles().get(directory.getFiles().size() - 1).setContents(someString());

        //Add some text files
        for (int i = 1; i <= 20; i++) {
            while (true) {
                int fileNumber = (int) (Math.random() * 49 + 1);    //To create files #1...50
                String type = "doc";
                if (fileExistCheck(directory.getFiles(), "File_" + fileNumber, type)) {
                    directory.getFiles().add(new AudioFile("File_" + fileNumber, type));

                    //Let's add some content
                    directory.getFiles().get(directory.getFiles().size() - 1).setContents(someString());
                    break;
                }
            }
        }

        //Let's add few photographic files
        for (int i = 1; i <= 10; i++) {
            while (true) {
                int fileNumber = (int) (Math.random() * 49 + 1);    //To create files #1...50
                String type = "jpg";
                if (fileExistCheck(directory.getFiles(), "File_" + fileNumber, type)) {
                    directory.getFiles().add(new AudioFile("File_" + fileNumber, type));

                    //Let's add some content
                    directory.getFiles().get(directory.getFiles().size() - 1).setContents(someString());
                    break;
                }
            }
        }

        //Let's print file list as we has it now
        FileListPrint.printFileList(directory);

        //User's interface
        while(true) {
            System.out.println("Do you want to sort it? Type '(n)ame', '(t)ype', '(s)ize' or 'e(x)it' to end the program:");
            String command = scanner.next();
            if (command.equals("x") || command.equals("e") || command.equals("exit")) {
                break;
            }

            if (command.equals("n") || command.equals("name")) {
                FileSort.byName(directory.getFiles());
            }

            if (command.equals("t") || command.equals("type")) {
                FileSort.byType(directory.getFiles());
            }

            if (command.equals("s") || command.equals("size")) {
                FileSort.bySize(directory.getFiles());
            }
            FileListPrint.printFileList(directory);
        }
    }

    //This method checks if file with such name and type exists
    private static boolean fileExistCheck(ArrayList<File> files, String fileName, String fileType) {
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
    private static String someString () {
        String string = "";
        int length = (int)(Math.random() * 512);
        for (int i = 0; i <= length; i++) {
        char generatedChar = (char)(Math.random() * 65535);
            string += generatedChar;
        }
        return string;
    }
}