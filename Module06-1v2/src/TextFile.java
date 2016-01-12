public class TextFile extends File {
    //Конструктор класу
    public TextFile(String name) {
        super(name);
        contents = "Contents of '" + name + "'";
    }

    //Поля класу
    private String author;
    private String encoding;

    //Методи класу
    public void setContents (String contents) {
        this.contents = contents;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getEncoding () {
        return encoding;
    }

    public void setEncoding (String encoding) {
        this.encoding = encoding;
    }
}
