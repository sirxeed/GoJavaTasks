import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Directory extends File {
    private ArrayList<File> files = new ArrayList<File>();

    //Геттери
    public ArrayList<File> getFiles() {
        return files;
    }

    public File getFileByName(String fileName) throws FileNotFoundException {
        int fileNumber = -1;
        for (int i = 0; i <= files.size() - 1; i++) {
            if (files.get(i).getName().equals(fileName)) {
                fileNumber = i;
                break;
            }
        }


        if (fileNumber != -1) {
            System.out.println("Found '" + fileName + "' file");
            return files.get(fileNumber);
        } else {
            throw new FileNotFoundException("File '" + fileName + "' not found");
        }

    }

    public void addFiles(File file) {
        files.add(file);
    }
}
