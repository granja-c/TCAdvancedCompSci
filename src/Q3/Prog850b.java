package Q3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prog850b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog850b.txt"));
            Map<String, Integer> map = new HashMap<>();

            while (sc.hasNext()) {
                String name = sc.next();
                int[] nums = new int[4];
                for (int i = 0; i < 4; i++) {
                    nums[i] = sc.nextInt();
                }
                if (!map.containsKey(name)) { map.put(name, nums[3]); }
                else { map.put(name, map.get(name) + nums[3]); }
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
