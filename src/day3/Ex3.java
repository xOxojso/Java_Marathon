package day3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            double divisible = sc.nextDouble();
            double divider = sc.nextDouble();
            if (divider == 0) {
                System.out.println("Деление на 0");
                i++;
                continue;
            }
            System.out.println(divisible / divider);
            i++;
        }
    }
}
