package data.city;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    private static final String[] streets = new String[] {
            "Wallingford Road",
            "Abbey Gate",
            "Main Street (Humberstone)",
            "Butterw ick Drive",
            "Sandhurst Road",
            "Melton Road"
    };
    private static final Random r = new Random();
    private DataGenerator(){}

    public static List<House> generateHouses(int count) {
        List<House> houses = new ArrayList<>(count);

        for(int i = 0; i < count; i++) {
            House house = new House();
            house.level = r.nextInt(50);
            house.number = r.nextInt(100);
            house.street = streets[r.nextInt(streets.length - 1)];
            house.flats = generateFlats(r.nextInt(2) + 1);
            houses.add(house);
        }
        return  houses;
    }

    public static List<Flat> generateFlats(int count) {
        List<Flat> flats = new ArrayList<>(count);

        for(int i = 0; i < count; i++) {
            Flat flat = new Flat();
            flat.countOfDoors = r.nextInt(5) + 1;
            flat.number = r.nextInt(199) + 1;
            flat.rooms = generateRooms(r.nextInt(1) + 1);
            flats.add(flat);
        }
        return  flats;
    }

    public static List<Room> generateRooms(int count) {
        List<Room> rooms = new ArrayList<>(count);

        for(int i = 0; i < count; i++) {
            Room room = new Room();
            room.countOfWindows = r.nextInt(9) + 1;
            room.square = r.nextInt(80) + 20;
            rooms.add(room);
        }
        return rooms;
    }
}
