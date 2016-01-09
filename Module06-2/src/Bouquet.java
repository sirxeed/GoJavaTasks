import java.util.ArrayList;

public class Bouquet {
    //Поля класу
    private ArrayList<Flower> flowers = new ArrayList<>();

    //Конструктор
    Bouquet(Flower flower) {
        flowers.add(0, flower);
    }

    //Методи
    //Геттери і сеттери
    public ArrayList getFlowers() {
        return flowers;
    }

    public int getQuantity() {
        return flowers.size();
    }

    public void add(Flower flower) {
        flowers.add(flower);
        System.out.println("Flower '" + flowers.get(flowers.size()-1).getFlowerName() + "' added to bouquet");
    }

    public Flower getFlowerByName(String flowerName) {
        try {
            //Порядковий номер квітки в букеті, яка повертається
            int flowerIndex = -1;
            for (int i = 0; i < flowers.size(); i++) {
                if (flowers.get(i).getFlowerName().equals(flowerName)) {
                    flowerIndex = i;
                    break;
                }
            }
            return flowers.get(flowerIndex);
        }
        catch (IndexOutOfBoundsException e) {
            System.err.print("Flower '" + flowerName + "' not found!");
        }

        return null;
    }
}
