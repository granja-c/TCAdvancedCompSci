package Q3;

import java.util.Scanner;

public class Pelican566 {
    public static int hashCode(String key) {
        key = key.toUpperCase();
        char[] chars = key.toCharArray();
        int n1 = chars[0];
        int n2 = chars[1];
        int n3 = chars[key.length()-1];
        int n4 = chars[key.length()-2];
        int res = n1 * 1000 + n2 * 100 + n3 * 10 + n4;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(hashCode(name));
    }
}
