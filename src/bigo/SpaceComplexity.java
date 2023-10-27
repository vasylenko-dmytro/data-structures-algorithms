package bigo;

import java.util.Arrays;

public class SpaceComplexity {

    public static void booooo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("boooooo!");
        }
    }

    public static void arrayOfHiNTimes(int n) {
        String[] hiArray = new String[n];
        Arrays.fill(hiArray, "hi");
        System.out.println(Arrays.toString(hiArray));
    }

    public static void main(String[] args) {
        booooo(5);
        arrayOfHiNTimes(5);
    }
}
