import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<File>();
        Directory directory = new Directory(files);

        directory.addFiles(new GraphicFile());
        for (int i = 1; i <= 10; i++) {
            directory.addFiles(new AudioFile());
        }
        directory.addFiles(new TextFile());
        directory.addFiles(new TextFile());

    }
}
