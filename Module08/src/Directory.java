import java.util.ArrayList;

public class Directory extends File {
    private ArrayList<File> files = new ArrayList<>();

    Directory(ArrayList<File> files, String name) {
        this.name = name;
    }

    //Геттер
    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFiles(File file) {
        files.add(file);
    }
}
