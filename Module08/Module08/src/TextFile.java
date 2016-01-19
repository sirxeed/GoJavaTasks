public class TextFile extends File {
    //Поля класу
    private String contents; //Нехай буде стрінг
    private String author;
    private String encoding;

    public TextFile(String name, String type) {
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
