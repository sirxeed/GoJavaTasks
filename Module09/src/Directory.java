import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    private List<File> files = new ArrayList<>();

    Directory(List<File> files, String name) {
        this.name = name;
    }

    //Геттер
    public List<File> getFiles() {
        return files;
    }

    public void addFiles(File file) {
        files.add(file);
    }
}
