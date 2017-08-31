package data.generic.data;

import data.generic.data.animal.Cat;
import data.generic.data.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    public List<Cell<Dog>> dogs = new ArrayList<>();
    public List<Cell<Cat>> cats = new ArrayList<>();
}
