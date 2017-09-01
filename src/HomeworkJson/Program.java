package HomeworkJson;

import com.alibaba.fastjson.JSON;
import sun.util.calendar.BaseCalendar;

import java.io.IOException;
import java.util.Date;

/**
 * Created by user22 on 31.08.2017.
 */
public class Program {
    public static void main(String[] args) throws IOException {
//        ArrayList<Fruit> fruitArrayList = new ArrayList<>();

//        fruitArrayList.add(new Fruit(10, "10/07/2017", 100, Fruit.typeOfFruit.banana));
//        fruitArrayList.add(new Fruit(5, "10/07/2017", 70, Fruit.typeOfFruit.apple));
       // TradeShop tradeShop = new TradeShop();
//        Fruit fruit = new Fruit(5, "10/07/2017", 70, Fruit.typeOfFruit.apple);
//        Entity entity = new Entity("Ivan", 23, new String[]{"Ivan", "Petro"}, Entity.Type.Animal);
        TradeShop tradeShop = new TradeShop();
//        String json = tradeShop.addFruits("files/jsonFruits.txt");
//        tradeShop = JSON.parseObject(json, TradeShop.class);
        tradeShop.addFruits("files/jsonFruits.txt");
        tradeShop.save(tradeShop,"files/lavka.txt");
        tradeShop.addFruits("files/jsonFruits.txt");
        tradeShop.addFruits("files/jsonFruits.txt");

 //       System.out.println(json);
        tradeShop.load("files/lavka.txt");
        System.out.println();




    }
}
