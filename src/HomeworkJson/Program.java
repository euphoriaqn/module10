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

        tradeShop.addFruits("files/jsonFruits.txt");
        tradeShop.save(tradeShop,"files/lavka.txt");
        tradeShop.addFruits("files/jsonFruits.txt");
        tradeShop.addFruits("files/jsonFruits.txt");

 //       System.out.println(json);
        tradeShop.load("files/lavka.txt");
        System.out.println();




    }
}
