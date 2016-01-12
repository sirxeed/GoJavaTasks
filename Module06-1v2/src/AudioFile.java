public class AudioFile extends File {

    //Конструктор класу
    public AudioFile(String name) {
        super(name);
        contents = "Contents of ' " + name + "'";
    }

    //Поля класу
    private int frequency;

    //Методи класу
    public void setContents (String contents) {
        this.contents = contents;
    }

    public int getFrequency () {
        return frequency;
    }

    public void setFrequency (int frequency) {
        this.frequency = frequency;
    }
}
