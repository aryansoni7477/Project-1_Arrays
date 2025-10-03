package org.studyeasy;

import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8};
        int n=findMissingNumberInArray(arr);
        System.out.println(n);
    }
    public static int findMissingNumberInArray(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }
}
