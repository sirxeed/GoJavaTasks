import java.util.ArrayList;

public class Directory extends File {
    private ArrayList<File> files = new ArrayList<File>();

    Directory(ArrayList<File> files) {

    }

    //Геттер
    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFiles(File file) {
        files.add(file);
    }
}
