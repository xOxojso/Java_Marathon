package day12;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */
public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mustang");
        list.add("Mazda");
        list.add("BMW");
        list.add("Renault");
        list.add("McLaren");

        System.out.println(list);

        list.add(list.size() / 2, "Audi");
        list.remove(0);
        System.out.println(list);
    }
}
