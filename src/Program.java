import com.alibaba.fastjson.JSON;
import data.city.DataGenerator;
import data.city.House;
import utils.FileUtils;

import java.io.*;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
        List<House> city;
        try {
            String json = FileUtils.readFromFile("files/data.txt");
            city = JSON.parseArray(json, House.class);
        } catch (Exception e) {
            System.err.println("Data corrupted");
            System.out.println("Generating data");
            city = DataGenerator.generateHouses(2);
        }

        System.out.println("End");
    }
}
