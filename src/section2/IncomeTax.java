package section2;

import java.util.Scanner;

public class IncomeTax {

    public static void main(String[] args) {
        double reminder, tax, tax2, tax3 = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = sc.nextInt();
        if (salary <= 300000) {
            System.out.println("Tax amount is : 0 ");
        } else if (salary > 300000 && salary <= 500000) {
            reminder = (salary - 250000);
            tax = (reminder * 5) / 100;
            System.out.println("Tax amount is : " + tax);

        } else if (salary > 500000 && salary <= 1000000) {
            reminder = (salary - 500000);
            tax = (250000 * 5) / 100;
            System.out.println(tax);
            tax2 = (reminder * 20) / 100;
            System.out.println(tax2);
            System.out.println("Tax amount is : " + (tax + tax2));
        } else {
            reminder = (salary - 1000000);
            tax = (250000 * 5) / 100;
            System.out.println(tax);
            tax2 = (500000 * 20) / 100;
            System.out.println(tax2);
            tax3 = (reminder * 30) / 100;
            System.out.println(tax3);
            System.out.println("Tax amount is : " + (tax + tax2 + tax3));
        }
        sc.close();

    }

}
