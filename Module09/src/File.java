public class File {
    //Поля класу
    protected String name;
    protected String type;
    protected String path;
    protected String contents;
    protected boolean hidden = false;
    protected boolean directory = false;
    protected int size = 0;
    protected boolean isEncrypted = false;

    //Конструктори
    public File() {
        name = "NewFile";
        type = "tmp";
        path = "C:\\";
        directory = false;
    }

    public File(String name, String type, String path) {
        this.name = name;
        this.type = type;
        this.path = path;
    }

    public File(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public File(String name, boolean directory) {
        this.name = name;
        this.directory = true;
    }

    //Методи класу
    //Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isDirectory() {
        return directory;
    }

    public void move(String pathNew) {
        //move algorithm
    }

    public void delete() {
        //delete algorithm
    }

    public int getSize() {
        return size;
    }

    public void rename(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setContents (String contents) {
        this.contents = contents;
        this.size = contents.length();
    }

    public String getContents () {
        return contents;
    }

}
