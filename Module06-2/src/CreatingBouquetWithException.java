import java.util.Scanner;

/**
 * Created by Андрій on 09.01.2016.
 */
public class CreatingBouquetWithException {

    public static void main(String[] args) {
        //Створюємо букет з новою астрою
        Bouquet bouquet = new Bouquet(new Aster());

        //Додаємо ромашку
        bouquet.add(new Chamomile());

        //Додаємо п'ять тюльпанів
        for (int i = 0; i < 5; i++) {
            bouquet.add(new Tulip());
        }

        System.out.println();
        System.out.println("Which flower in this bouquet do you prefer?");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String someFlower = scanner.next();
            if (bouquet.getFlowerByName(someFlower) == null) {
                break;
            }
            else {
                System.out.println("Flower '" + bouquet.getFlowerByName(someFlower).getFlowerName() + "' is a very good choice!");
            }

        }
    }
}
