package HomeworkJson;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user22 on 31.08.2017.
 */
public class TradeShop {


    public List<Fruit> fruits = new ArrayList<>();
    public  void addFruits(String pathToJsonFile) throws IOException {
        String json = new Scanner(new File(pathToJsonFile)).useDelimiter("\\Z").next();
        System.out.println("Loading data");
        TradeShop tradeShop = JSON.parseObject(json, TradeShop.class);
        for (Fruit value: tradeShop.fruits) {
            fruits.add(value);
        }

    }
    public void save(TradeShop tradeShop, String pathToJsonFile) throws IOException {
        String json = JSON.toJSONString(tradeShop,true);
        FileWriter writer = new FileWriter(pathToJsonFile);
        writer.write(json);
        writer.flush();
        writer.close();
    }
    public void load(String pathToJsonFile) throws IOException {
        fruits.clear();
        System.out.println("Loading data");
        String json = new Scanner(new File(pathToJsonFile)).useDelimiter("\\Z").next();
        TradeShop tradeShop = JSON.parseObject(json, TradeShop.class);
        for (Fruit value: tradeShop.fruits) {
            fruits.add(value);
        }
    }
//

}
