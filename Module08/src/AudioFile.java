public class AudioFile extends File {
    //Поля класу
    private String contents; //Нехай буде стрінг
    private int frequency;

    public AudioFile(String name, String type) {
        super(name, type);
    }

    //Методи класу
    public int getFrequency () {
        return frequency;
    }

    public void setFrequency (int frequency) {
        this.frequency = frequency;
    }
}
