package data.generic;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.SourceTree;
import data.generic.data.animal.Cat;
import data.generic.data.animal.Dog;
import data.generic.data.Cell;
import data.generic.data.Shelter;
import utils.FileUtils;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

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
        FileUtils.writeToFile(json, "files/shelter.txt");
       // System.out.println(FileUtils.readFromFile("files/shelter.txt"));

    }
}
