package Q3;

public class EnumLab {
    enum Level { // can have methods + attributes + interfaces
        LOW,     // constants are public static FINAL (basically ints)
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level mylvl = Level.MEDIUM;

        switch (mylvl) {
            case LOW -> System.out.println("Low Level");
            case MEDIUM -> System.out.println("Medium Level");
            case HIGH -> System.out.println("High Level");
        }

        for (Level op : Level.values()) {
            System.out.println(op);
        }
    }
}
