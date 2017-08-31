package HomeworkJson;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user22 on 31.08.2017.
 */
public class TradeShop {
    public List<Fruit> fruitList = new ArrayList<>();
    public void addFruits(String pathToJsonFile) throws IOException {
        System.out.println("Loading data");
        BufferedReader reader = new BufferedReader(new FileReader(pathToJsonFile));
        String json = reader.readLine();
        fruitList = JSON.parseArray(json, Fruit.class);
    }
    public void save(String pathToJsonFile) throws IOException {
        String json = JSON.toJSONString(fruitList);
        System.out.println("Saving data");
        FileWriter writer = new FileWriter(pathToJsonFile);
        writer.write(json);
        writer.flush();
        writer.close();
    }
    public void load(String pathToJsonFile) throws IOException {
      fruitList = null;
      System.out.println("Loading data");
      BufferedReader reader = new BufferedReader(new FileReader(pathToJsonFile));
      String json = reader.readLine();
      fruitList = JSON.parseArray(json, Fruit.class);
    }

}
