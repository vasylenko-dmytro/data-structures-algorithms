package bigo;

public class LogBoxes {
    public static final int[] boxes = {1, 2, 3, 4, 5};

    public static void logFirstTwoBoxes(int[] array) {
        System.out.println(array[0]);   //O(1)
        System.out.println(array[1]);   //O(1)
    }

    public static void main(String[] args) {
        logFirstTwoBoxes(boxes);        //O(2)
    }
}
