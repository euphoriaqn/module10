package HomeworkJson;

/**
 * Created by user22 on 31.08.2017.
 */
public class Fruit {

        private typeOfFruit type;
        private int shelfLife;
        private String dateOfSupply;
        private int price;
    enum typeOfFruit {strawberry,  pear, watermelon, banana,
        orange, mandarin, apple, kiwi, pineapple, raspberries}

    public Fruit(int shelfLife, String dateOfSupply, int price, typeOfFruit type) {
        this.shelfLife = shelfLife;
        this.dateOfSupply = dateOfSupply;
        this.price = price;
        this.type = type;
    }
}
