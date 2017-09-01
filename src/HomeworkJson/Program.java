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

        TradeShop tradeShop = new TradeShop();
        //тут происходит добавление в коллекцию из JSON-файла №1
        tradeShop.addFruits("files/jsonFruits.txt");
        //тут происходит сохранение в JSON-файл №2 и нарушение структур
        tradeShop.save(tradeShop,"files/lavka.txt");
        tradeShop.addFruits("files/jsonFruits.txt");
        tradeShop.addFruits("files/jsonFruits.txt");
        tradeShop.load("files/lavka.txt");
        System.out.println();




    }
}
