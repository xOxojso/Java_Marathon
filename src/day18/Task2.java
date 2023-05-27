package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(countSeven(717771237));
    }

    public static int countSeven(int value) {
        if (value == 0) return 0;

        if (value % 10 == 7) {
            return 1 + countSeven(value / 10);
        } else {
            return countSeven(value / 10);
        }
    }
}
