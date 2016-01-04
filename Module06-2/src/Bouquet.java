public class Bouquet {
    //Поля класу
    private Flower[] flowers = new Flower[1];

    //Конструктор
    Bouquet(Flower flower) {
        flowers[0] = flower;
    }

    //Методи
    //Геттери і сеттери
    public Flower[] getFlowers() {
        return flowers;
    }

    public int getQuantity() {
        return flowers.length;
    }

    //Логіка
    public void smell() {
        //Smell algorithm
    }

    public void present() {
        //Present algorithm
    }

    /*
    public void add(Flower flower) {
        //Бекап квітів, які вже в букеті
        Flower[] flowersTemp = new Flower[flowers.length];
        flowersTemp = flowers;

        //Створюємо новий масив із розмірністю +1
        Flower[] this.flowers = new Flower[flowersTemp.length + 1];

        //Переносимо квіти з бекапа в новий букет
        for (int i = 0; i <= this.flowers.length - 1; i++) {
            this.flowers[i] = flowersTemp[i];
        }

        //Додаємо нову квітку
        flowers[flowers.length] = flower;
    }
    */

    public void add(Flower flower) {
        //Створюємо новий масив з розмірністю +1
        flowers = newFlowers(flowers);

        //додавання нового елемента
        flowers[flowers.length - 1] = flower;
    }

    //Метод створення нового масиву з розмірністю +1 зі збереженням старих елементів
    private Flower[] newFlowers(Flower[] flowersOld) {
        //Новий масив
        Flower[] flowers = new Flower[flowersOld.length + 1];

        //Перенос елементів зі старого масива в новий
        for (int i = 0; i <= flowersOld.length - 1; i++) {
            flowers[i] = flowersOld[i];
        }
        return flowers;
    }

}
