package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class MSOE078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int l = sc.nextInt();
        System.out.print("Width: ");
        int w = sc.nextInt();
        int[][] map = new int[l][w];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                System.out.println("Altitude: ");
                map[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> highs = new ArrayList<>();
        for (int i = 1; i < l-1; i++) {
            for (int j = 1; j < w-1; j++) {
                int x = map[i][j];
                if (x > map[i-1][j-1] && x > map[i-1][j] && x > map[i-1][j+1] && x > map[i][j-1] &&
                x > map[i][j+1] && x > map[i+1][j-1] && x > map[i+1][j] && x > map[i+1][j+1]) {
                    highs.add(map[i][j]);
                }
            }
        }
        System.out.print("The peaks are ");
        for (int i = 0; i < highs.size(); i++) {
            System.out.println(highs.get(i));
        }
    }
}
