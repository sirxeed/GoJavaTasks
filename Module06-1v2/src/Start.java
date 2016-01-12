import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<File> files = new ArrayList<>();
        Directory directory = new Directory();

        Scanner scanner = new Scanner(System.in);
        directory.setName("dir1");
        System.out.println("You created a directory '" + directory.getName() + "'");

        for (int i = 1; i <= 10; i++) {
            directory.addFiles(new TextFile("File" + i));
            System.out.println("'" + directory.getFiles().get(directory.getFiles().size() - 1).getName() + "' file has been created");
        }

        //Візьмемо файл за іменем
        System.out.print("Enter the file name you want to get or 'exit': ");
        while (true) {
            String fileName = scanner.next();
            if (fileName.equals("exit")) {
                break;
            } else if (directory.getFileByName(fileName) == -1) {
                System.out.println("File '" + fileName + "' not exist! Try again.");
            } else {
                System.out.println(directory.getFiles().get(directory.getFileByName(fileName)).getContents());
            }
        }

    }
}
