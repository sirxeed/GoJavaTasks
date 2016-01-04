public class Instrument {
    //Поля класу
    private String type;
    private String brand;
    private String model;
    private int color;

    //Конструктор
    Instrument() {
        type = "guitar";
        brand = "Gibson";
        model = "Les Paul";
        color = 0x903000;
    }

    Instrument(String type, String brand, String model, int color) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    //Методи
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void play() {
        //play algorithm
    }
}
