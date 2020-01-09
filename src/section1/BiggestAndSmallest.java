package section1;

import java.util.Scanner;

public class BiggestAndSmallest {

    public static void main(String[] args) {
        int n, max, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        min = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum value:" + max);
        System.out.println("Minimum value:" + min);
        s.close();

    }

}
