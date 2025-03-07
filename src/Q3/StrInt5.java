package Q3;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StrInt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var dig = Pattern.compile("[0-9]");
        String str = sc.nextLine();
        var matcher = dig.matcher(str);

        var str2 = matcher.replaceAll("");
        if (str2.isEmpty()) {
            System.out.println("The string was only digits.");
        } else System.out.println("The string was not only digits.");
    }
}
