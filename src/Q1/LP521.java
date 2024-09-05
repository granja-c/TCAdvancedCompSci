package Q1;

import java.util.Scanner;
import Utils.Console;
public class LP521 {
    public static void main(String[] args) {
        String fn = Console.input("First name: ");
        String ln = Console.input("Last name: ");
        String group = "";
        if (ln.substring(0, 1).compareTo("I") < 0) group = "Group 1";
        else if (ln.substring(0, 1).compareTo("S") < 0) group = "Group 2";
        else group = "Group 3";
        System.out.println(fn + " " + ln + " is in " + group);
    }
}
/*
First name: Camila
Last name: Granja
Camila Granja is in Group 1
*/
/*
First name: Camila
Last name: Zdkjf
Camila Zdkjf is in Group 3

 */