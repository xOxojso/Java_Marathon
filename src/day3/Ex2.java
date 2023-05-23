package day3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double divisible = sc.nextDouble();
            double divider = sc.nextDouble();
            if (divider == 0) {
                break;
            }

            System.out.println(divisible / divider);
        }
    }
}
