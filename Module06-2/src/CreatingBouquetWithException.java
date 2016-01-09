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

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        while (true) {
            System.out.println("Which flower in this bouquet do you prefer? (Type 'done' to exit)");
            String someFlower = scanner.next();
            if (someFlower.equals("done")) {
                break;
            }
            System.out.println("Flower '" + bouquet.getFlowerByName(someFlower).getFlowerName() + "' is a very good choice!");
        }
    }
}
