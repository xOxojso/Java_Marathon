package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String city = sc.nextLine();
            if (city.equals("Stop")) {
                break;
            }
            switch (city) {
                case "Москва", "Владивосток", "Ростов" -> System.out.println("Россия");
                case "Рим", "Милан", "Турин" -> System.out.println("Италия");
                case "Ливерпуль", "Манчестер", "Лондон" -> System.out.println("Англия");
                case "Берлин", "Мюнхен", "Кёльн" -> System.out.println("Германия");
                default -> System.out.println("Неизвестная страна");
            }
        }
    }
}
