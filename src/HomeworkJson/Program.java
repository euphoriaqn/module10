package HomeworkJson;

import com.alibaba.fastjson.JSON;
import data.generic.data.Cell;
import data.generic.data.Shelter;
import data.generic.data.animal.Cat;
import data.generic.data.animal.Dog;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user22 on 31.08.2017.
 */
public class Program {
    public static void main(String[] args) throws IOException {
//        TradeShop tradeShop = new TradeShop();
//        tradeShop.fruitList.add(new Fruit(10, "10/07/2017", 100, Fruit.typeOfFruit.banana));
//        tradeShop.fruitList.add(new Fruit(5, "10/07/2017", 70, Fruit.typeOfFruit.apple));
//        Fruit fruit = new Fruit(5, "10/07/2017", 70, Fruit.typeOfFruit.apple);
//        String json = JSON.toJSONString(fruit);
//        save(json,"files/jsonFruits.txt");




        Shelter shelter = new Shelter();

        // adding one Cell with cat
        Cell<Cat> cellCat = new Cell<>();
        cellCat.entity = new Cat();
        cellCat.entity.name = "111";
        shelter.cats.add(cellCat);

        Cell<Cat> cellCat2 = new Cell<>();
        cellCat2.entity = new Cat();
        cellCat2.entity.name = "2222222";
        shelter.cats.add(cellCat2);

        Cell<Dog> cellDog = new Cell<>();
        cellDog.entity = new Dog();
        cellDog.entity.name = "Bobik";
        cellDog.entity.happiness = Dog.Happiness.Middle;
        shelter.dogs.add(cellDog);
        String json = JSON.toJSONString(shelter);
        save(json,"files/jsonFruits.txt");

    }
    public static void save(String  json, String pathToJsonFile) throws IOException {

        System.out.println("Saving data");
        FileWriter writer = new FileWriter(pathToJsonFile);
        writer.write(json);
        writer.flush();
        writer.close();
    }
}
