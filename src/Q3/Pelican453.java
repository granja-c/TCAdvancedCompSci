package Q3;
import DataStructures.Set;

public class Pelican453 {
    public static void main(String[] args) {
        Set set1 = new Set<String>();
        set1.insert("Bill");
        set1.insert("Larry");
        set1.insert("Regina");
        set1.insert("Susie");
        set1.insert("David");
        Set set2 = new Set<String>();
        set2.insert("Bill");
        set2.insert("Lilly");
        set2.insert("Reggie");
        set2.insert("Susie");
        set2.insert("Dolly");
        set2.insert("Dave");
        Set res = set1.intersection(set2);

        var iter = res.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
