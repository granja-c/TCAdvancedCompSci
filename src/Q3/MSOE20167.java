package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MSOE20167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a file name: "); // clues.dat
        String f = sc.next();
        try {
            Scanner file = new Scanner(new File(f));
            int n = file.nextInt();
            int c = file.nextInt();
            ArrayList<int[]> clues = new ArrayList<>();
            while (file.hasNext()) {
                int[] nums = new int[3];
                for (int i = 0; i < 3; i++) {
                   nums[i] = file.nextInt();
                }
                clues.add(nums);
            }

            int[][] puzzle = new int[n][n];
            System.out.println("Enter a file name: ");
            f = sc.next();
            Scanner file2 = new Scanner(new File(f));
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    puzzle[row][col] = sc.nextInt();
                }
            }

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    int x = puzzle[row][col];
                }
            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
