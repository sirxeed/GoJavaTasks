public class GraphicFile extends File {

    //Конструктор класу
    public GraphicFile(String name) {
        super(name);
        contents = "Contents of ' " + name + "'";
    }

    //Поля класу
    private String colorIndex;

    //Методи класу
    public void setContents (String contents) {
        this.contents = contents;
    }

    public String getColorIndex () {
        return colorIndex;
    }

    public void setColorIndex (String colorIndex) {
        this.colorIndex = colorIndex;
    }
}
