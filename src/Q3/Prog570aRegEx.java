package Q3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Prog570aRegEx {
    private static void printCharSet(boolean[] set, char baseChar) {
        for (int i = 0; i < set.length; i++) {
            if (set[i]) System.out.print((char)(baseChar + i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Langdat/prog570a.dat"));

            // Arrays to track common lower+uppercase chars
            var commLower = new boolean[26];
            var commUpper = new boolean[26];
            boolean isFirst = true;

            var lowerPattern = Pattern.compile("[a-z]");
            var upperPattern = Pattern.compile("[A-Z]");
            var nonAlpha = Pattern.compile("[^a-zA-Z\\s]");

            while (sc.hasNextLine()) {
                String ln = sc.nextLine();
                System.out.println("Line: " + ln);

                var lowerSet = new boolean[26];
                var upperSet = new boolean[26];
                var nonAlphaSet = new StringBuilder();

                var lcMatch = lowerPattern.matcher(ln);
                while (lcMatch.find()) {
                    char lowerChar = lcMatch.group().charAt(0);
                    lowerSet[lowerChar - 'a'] = true;
                }

                var ucMatch = upperPattern.matcher(ln);
                while (ucMatch.find()) {
                    char upperChar = ucMatch.group().charAt(0);
                    upperSet[upperChar - 'A'] = true;
                }
                var naMatch = nonAlpha.matcher(ln);
                while (naMatch.find()) {
                    nonAlphaSet.append(naMatch.group());
                }

                System.out.print("Lowercase: ");
                printCharSet(lowerSet, 'a');
                System.out.print("Uppercase: ");
                printCharSet(upperSet, 'A');
                System.out.println("Odds and Ends: " + nonAlphaSet + "\n");

                if (isFirst) {
                    commLower = lowerSet;
                    commUpper = upperSet;
                    isFirst = false;
                } else {
                    for (int i = 0; i < 26; i++) {
                        commLower[i] = commLower[i] && lowerSet[i];
                        commUpper[i] = commUpper[i] && upperSet[i];
                    }
                }
            }

            System.out.print("Characters in every line (lowercase): ");
            printCharSet(commLower, 'a');
            System.out.print("Characters in every line (uppercase): ");
            printCharSet(commUpper, 'A');

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
