package bigo;

import java.util.Arrays;
import java.util.Objects;

public class FindingNemo {
    public static final String[] nemo = {"nemo"};
    public static final String[] everyone =
            {"dory", "bruce", "marlin", "nemo", "gill",
             "bloat", "nigel", "squirt", "darla", "hank"};
    public static final String[] large = new String[100];

    public static void findNemo(String[] array) {
        long startTime = System.nanoTime();
        for (String s : array) {
            if (Objects.equals(s, "nemo")) {
                System.out.println("Found NEMO!");
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Call to find Nemo took: "
                + (double) (endTime - startTime) / 1000000  + " ms");
    }

    public static void main(String[] args) {
        Arrays.fill(large, "nemo");

        findNemo(large);    //O(n) --> Linear Time
    }
}
