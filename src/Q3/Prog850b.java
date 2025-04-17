package Q3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prog850b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/X.dat"));
            Map<String, int[]> map = new HashMap<>();

            while (sc.hasNext()) {
                String name = sc.next();
                int[] nums = new int[4];
                for (int i = 0; i < 8; i++) {
                    nums[i] = sc.nextInt();
                }
                map.put(name, nums);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
