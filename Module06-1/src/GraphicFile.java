public class GraphicFile extends File {

    //Конструктор класу
    public GraphicFile(String name) {
        super(name);
    }

    //Поля класу
    private String contents; //Нехай буде стрінг
    private String colorIndex;

    //Методи класу
    public String getContents () {
        return contents;
    }

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
