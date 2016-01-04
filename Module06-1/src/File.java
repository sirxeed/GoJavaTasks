public class File {
    //Поля класу
    private String name;
    private String type;
    private String path;
    private boolean hidden = false;
    private boolean directory = false;

    //Конструктори
    File() {
        name = "NewFile";
        type = "tmp";
        path = "C:\\";
        directory = false;
    }

    File(String name, String type, String path) {
        this.name = name;
        this.type = type;
        this.path = path;
    }

    File(String name, boolean directory) {
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

    public void rename(String name, String type) {
        this.name = name;
        this.type = type;
    }

}
