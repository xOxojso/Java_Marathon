package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int result = recursionSum(numbers, 0);
        System.out.println(result);
    }

    public static int recursionSum(int[] numbers, int sum) {
        if(sum == numbers.length) {
            return sum;
        }
        return numbers[sum] + recursionSum(numbers, sum + 1);
    }
}
