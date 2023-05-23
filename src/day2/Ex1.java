package day2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) {
            if (n >= 1 && n <= 4) {
                System.out.println("Малоэтажный дом");
            } else if (n >= 5 && n <= 8) {
                System.out.println("Среднеэтажный дом");
            } else {
                System.out.println("Многоэтажный дом");
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
