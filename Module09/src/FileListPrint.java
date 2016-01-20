public class FileListPrint {
    public static void printFileList(Directory directory) {
        System.out.println("Directory '" + directory.getName() + "' contains " + directory.getFiles().size() + " files:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("|   # \t|\t   Name.type       \t|\t   Size   \t| Encrypted |");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < directory.getFiles().size(); i++) {
            System.out.print("|   " + (i + 1) + "\t");
            System.out.print("|\t" + directory.getFiles().get(i).getName());
            System.out.print("." + directory.getFiles().get(i).getType() + "     \t|\t");
            System.out.print("   " + directory.getFiles().get(i).getSize() + "    \t|\t");
            System.out.println("  " + isEncryptedToString(directory.getFiles().get(i)) + " \t|");
        }
        System.out.println("-------------------------------------------------------------");
    }

    private static String isEncryptedToString(File file) {
        if (file.isEncrypted) {
            return "Yes";
        } else {
            return "No";
        }
    }

}
