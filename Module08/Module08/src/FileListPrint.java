public class FileListPrint {
    public static void printFileList(Directory directory) {
        System.out.println("Directory '" + directory.getName() + "' contains " + directory.getFiles().size() + " files:");
        System.out.println("-------------------------------------");
        System.out.println("|\tName.type    \t|\t   Size   \t|");
        System.out.println("-------------------------------------");
        for (int i = 0; i < directory.getFiles().size(); i++) {
            System.out.print("|\t" + directory.getFiles().get(i).getName());
            System.out.print("." + directory.getFiles().get(i).getType() + "  \t|\t");
            System.out.println("   " + directory.getFiles().get(i).getSize() + "    \t|");
        }
        System.out.println("-------------------------------------");
    }
}
