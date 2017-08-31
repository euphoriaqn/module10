package data;

public class Entity {
    public String name;
    public int age;
    public String[] friends;
    public Type type;

    public enum Type {
        Animal(1), Human(2), Other(3);

        private final int mask;

        Type(int mask) {
            this.mask = mask;
        }

        public int getMask() {
            return mask;
        }
    }

    public Entity(String name, int age, String[] friends, Type type) {
        this.name = name;
        this.age = age;
        this.friends = friends;
        this.type = type;
    }
}
