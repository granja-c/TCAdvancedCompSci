package Q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MSOE20167 {
    private static int errorFind(int[][] clues, int[][] solution) {
        int n = solution.length;
        int c = clues.length;
        int lvl = 0;

        for (int i = 0; i < n && lvl == 0; i++) {
            var row = new boolean[n+1];
            var col = new boolean[n+1];
            for (int j=0; j < n; j++) {
                if ((solution[i][j] > 0 && row[solution[i][j]]) ||
                        (solution[j][i] > 0 && col[solution[j][i]]) ) {
                    lvl = 1;
                    break;
                }
                row[solution[i][j]] = true;
                col[solution[j][i]] = true;
            }
        }
        if (lvl > 0) return lvl;

        for (int r = 0; r < n && lvl == 0; r++) {
            for (int cc = 0; cc < n ; cc++) {
                if (solution[r][c] == 0) {
                    var x = new boolean[n+1];
                    for (int i = 0; i < n; i++) {
                        x[solution[r][i]] = true;
                        x[solution[i][cc]] = true;
                    }
                    boolean all = true;
                    for (boolean b : x)
                        if (!b) {
                            all = false;
                            break;
                        }
                    if (all) {
                        lvl = 2;
                        break;
                    }
                }
            }
        }
        if (lvl > 0) return lvl;

        for (int clue = 0; clue < c; clue++) {
            int step = 0;
            if (clues[clue][0] <= 1) step = 1;
            else step = -1;
            boolean filled = true;
            int seen = 0;
            int tallest = 0;

            for (int i = 0; i < n; i++) {
                int ind = -1;
                if (step > 0) ind = step * i;
                else ind = (c-1) + step * i;
                int curr = -1;
                if (clues[clue][0] % 2 == 0) curr = solution[ind][clues[clue][1]];
                else curr = solution[clues[clue][1]][ind];
                if (curr == 0) {
                    filled = false;
                    break;
                } else if (curr > tallest) {
                    seen++;
                    tallest = curr;
                }
            }
            if (filled && (seen != clues[clue][2])) {
                lvl = 3;
                break;
            }
        }
        return lvl;
    }

    public static void main(String[] args) throws FileNotFoundException {
        var s = new Scanner(System.in);
        var sc = new Scanner(new File(s.next()));
        int n = sc.nextInt();
        int c = sc.nextInt();
        var clues = new int[c][3];
        for(int r = 0; r < c; r++) {
            for(int cc = 0; cc < 3; cc++) {
                clues[r][cc] = sc.nextInt();
            }
        }
        String sn = sc.next();
        var solsc = new Scanner(new File(sn));
        var solution = new int[c][3];
        for (int r = 0; r < c; r++) {
            for (int cc = 0; cc < 3; cc++) {
                solution[r][cc] = solsc.nextInt();
            }
        }
        int error = errorFind(clues, solution);

        if (error == 0) System.out.println("None");
        else if (error == 1) System.out.println("1- The same num between 1 and" + n + "appears more than once in a row or column");
        else if (error == 2) System.out.println("2- An empty cell can't be filled with a num since all the nums 1 through " + n + " already appear in the " + (2*n-2) +  " cells in the same row and column");
        else System.out.println("3- A row or column is filled but doesn't say the num of specified faces");
    }
}