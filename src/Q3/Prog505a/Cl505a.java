package Q3.Prog505a;

public class Cl505a {
    String name;
    int books;
    int points;
    
    public Cl505a(String n, int b) {
        name = n;
        books = b;
        if (books <= 3) points = books * 10;
        else if (books > 3 && books <= 6) points = 3 * 10 + books - 3 * 10;
        // else if (books > 6 )
    }
}
