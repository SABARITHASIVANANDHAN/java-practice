package section1;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sample input");
        int a = s.nextInt();
        System.out.println("Sample output");
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + "*" + i + " = " + (a * i));
        }
        s.close();
    }

}
