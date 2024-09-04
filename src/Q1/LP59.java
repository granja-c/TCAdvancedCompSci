package Q1;

public class LP59 {
    public static void main(String[] args) {
        System.out.println("x^1\t\tx^2\t\tx^3\t\tx^4\t\tx^5\t\t");
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print((int)Math.pow(i, j) + "\t\t");
            }
            System.out.println();
        }
    }
}
/*
x^1		x^2		x^3		x^4		x^5
1		1		1		1		1
2		4		8		16		32
3		9		27		81		243
4		16		64		256		1024
5		25		125		625		3125
6		36		216		1296		7776
 */