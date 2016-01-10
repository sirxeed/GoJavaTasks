public class TextFile extends File {
    //Конструктор класу
    public TextFile(String name) {
        super(name);
    }

    //Поля класу
    private String contents; //Нехай буде стрінг
    private String author;
    private String encoding;

    //Методи класу
    public String getContents () {
        return contents;
    }

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
