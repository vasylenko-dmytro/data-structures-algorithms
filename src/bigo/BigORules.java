package bigo;

public class BigORules {

    public static final int[] boxes = {1,2,3,4,5};
    public static final int[] numbers = {1,2,3,4,5,6,7,8,9};

    public static void logAllPairsOfArray(int[] array) {
        for (int k : array) {
            for (int i : array) {
                System.out.print(k);
                System.out.println(i);
            }
        }
    }

    public static void printAllNumbersThenAllPairSum(int[] numbers) {
        System.out.println("these are the numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("and these are their sums:");
        for (int firstNumber : numbers) {
            for (int secondNumber : numbers) {
                System.out.println(firstNumber + secondNumber);
            }
        }
    }

    public static void main(String[] args) {
        logAllPairsOfArray(boxes);
        printAllNumbersThenAllPairSum(numbers);
    }
}
