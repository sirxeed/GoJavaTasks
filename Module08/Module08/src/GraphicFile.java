public class GraphicFile extends File {
    //Поля класу
    private String contents; //Нехай буде стрінг
    private String colorIndex;

    public GraphicFile(String name, String type) {
        super(name, type);
    }

    //Методи класу
    public String getContents () {
        return contents;
    }

    public void setContents (String contents) {
        this.contents = contents;
        this.size = contents.length();
    }

    public String getColorIndex () {
        return colorIndex;
    }

    public void setColorIndex (String colorIndex) {
        this.colorIndex = colorIndex;
    }
}
