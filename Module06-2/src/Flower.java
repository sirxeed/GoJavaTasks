public abstract class Flower {
    //Поля класу
    private int height;
    private int color;
    String flowerName;

    //Конструктори
    Flower() {
        height = 10;
        color = 0xff0000;
    }

    Flower(int height, int color) {
        this.height = height;
        this.color = color;
    }

    //Методи класу
    //Геттери і сеттери
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getFlowerName() {
        return flowerName;
    }

    //Логіка
    public void cut() {
        //Cut algorithm
    }

    public void smell() {
        //Smell algorithm
    }
}
