package Q2;

import DataStructures.QStack;

public class QStackTest {
    public static void main(String[] args) {
        var qs = new QStack<Integer>();

        for (int i = 0; i < 5; i++) {
            qs.push(i);
        }
        while (!qs.isEmpty()) {
            System.out.println(qs.pop());
        }
    }
}
