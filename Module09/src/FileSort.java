import java.util.ArrayList;

public class FileSort {
    public static void byName(ArrayList<File> files) {
        //Bubble-method file name sort
        for (int i = 0; i < files.size() - 1; i++) {
            boolean filesWasSwapped = false;
            for (int j = 0; j < files.size() - 1; j++) {
                if (files.get(j).getName().compareTo(files.get(j + 1).getName()) > 0) {
                    swap(files, j, j + 1);
                }
                filesWasSwapped = true;
            }
            //Let's check if there was file swap
            if (!filesWasSwapped) {
                break;
            }
        }

        //Let's sort by file type if names are equal
        for (int i = 0; i < files.size() - 1; i++) {
            boolean filesWasSwapped = false;
            for (int j = 0; j < files.size() - 1; j++) {
                if (files.get(j).getName().equals(files.get(j + 1).getName()) && files.get(j).getType().compareTo(files.get(j + 1).getType()) > 0) {
                    swap(files, j, j + 1);
                }
                filesWasSwapped = true;
            }
            if (!filesWasSwapped) {
                break;
            }
        }
    }

    public static void byType(ArrayList<File> files) {
        //Bubble-method file type sort
        for (int i = 0; i < files.size() - 1; i++) {
            boolean filesWasSwapped = false;
            for (int j = 0; j < files.size() - 1; j++) {
                if (files.get(j).getType().compareTo(files.get(j + 1).getType()) > 0) {
                    swap(files, j, j + 1);
                }
                filesWasSwapped = true;
            }
            //Let's check if there was file swap
            if (!filesWasSwapped) {
                break;
            }
        }

        //Let's sort by file type if names are equal
        for (int i = 0; i < files.size() - 1; i++) {
            boolean filesWasSwapped = false;
            for (int j = 0; j < files.size() - 1; j++) {
                if (files.get(j).getType().equals(files.get(j + 1).getType()) && files.get(j).getName().compareTo(files.get(j + 1).getName()) > 0) {
                    swap(files, j, j + 1);
                }
                filesWasSwapped = true;
            }
            if (!filesWasSwapped) {
                break;
            }
        }
    }

    public static void bySize(ArrayList<File> files) {
        //Bubble-method file size sort
        for (int i = 0; i < files.size() - 1; i++) {
            boolean filesWasSwapped = false;
            for (int j = 0; j < files.size() - 1; j++) {
                if (files.get(j).getSize() > files.get(j + 1).getSize()) {
                    swap(files, j, j + 1);
                }
                filesWasSwapped = true;
            }
            //Let's check if there was file swap
            if (!filesWasSwapped) {
                break;
            }
        }

        //Bubble-method file name sort after size sort
        for (int i = 0; i < files.size() - 1; i++) {
            boolean filesWasSwapped = false;
            for (int j = 0; j < files.size() - 1; j++) {
                if (files.get(j).getSize() == files.get(j + 1).getSize() && files.get(j).getName().compareTo(files.get(j + 1).getName()) > 0) {
                    swap(files, j, j + 1);
                }
                filesWasSwapped = true;
            }
            //Let's check if there was file swap
            if (!filesWasSwapped) {
                break;
            }
        }

        //Let's sort by file type after size sort and if names are equal
        for (int i = 0; i < files.size() - 1; i++) {
            boolean filesWasSwapped = false;
            for (int j = 0; j < files.size() - 1; j++) {
                if (files.get(j).getSize() == files.get(j + 1).getSize() && files.get(j).getName().equals(files.get(j + 1).getName()) && files.get(j).getType().compareTo(files.get(j + 1).getType()) > 0) {
                    swap(files, j, j + 1);
                }
                filesWasSwapped = true;
            }
            if (!filesWasSwapped) {
                break;
            }
        }
    }

    private static void swap(ArrayList<File> files, int a, int b) {
        File tempFile = files.get(a);
        files.set(a, files.get(b));
        files.set(b, tempFile);
    }
}
