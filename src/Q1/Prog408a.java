package Q1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog408a {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/Prg408a.dat"));
            var matrix = new int[21][2];
            for (int i = 0; i < 21; i++) {
                matrix[i][0] = sc.nextInt();
                matrix[i][1] = sc.nextInt();
            }
            sc.close();
            bubbleSortM(matrix);
            System.out.println("ID\tScore");
            for (int[] r : matrix) {
                System.out.println(r[0] + "\t" + r[1]);
            }

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    private static void bubbleSortM(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length-i-1; j++) {
                if (mat[j][1] < mat[j+1][1]) {
                    int[] temp = mat[j];
                    mat[j] = mat[j+1];
                    mat[j+1] = temp;
                }
            }
        }
    }
}

/*
ID	Score
365	265
306	262
115	257
311	256
123	253
325	246
116	246
323	245
321	245
113	243
218	243
208	242
302	242
104	239
112	239
110	238
223	230
213	229
207	228
203	224
222	223
 */