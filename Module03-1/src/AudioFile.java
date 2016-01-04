public class AudioFile extends File {
    //Поля класу
    public String contents; //Нехай буде стрінг
    public int frequency;

    //Методи класу
    public String getContents () {
        return contents;
    }

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
