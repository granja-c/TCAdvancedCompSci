package Q3.Prog505a;

import Q3.Prog285b3.Cl285b3;

public class Cl505a implements Comparable<Cl505a> {
    String name;
    int books;
    int points;
    
    public Cl505a(String n, int b) {
        name = n;
        books = b;
        if (books <= 3) points = books * 10;
        else if (books > 3 && books <= 6) points = 3 * 10 + books - 3 * 10;
        else if (books >= 6) points = 30 + (books-3) * 15;
        else points = 30 + 45 + (books-6) * 20;
    }
    public int compareTo(Cl505a o) {
        return points - o.points;
    }
    public int getPoints() { return points; }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "\t" + books + "\t" + points;
    }
}
