package org.studyeasy;

import java.util.Arrays;

public class BestScore {
    public static void main(String[] args) {
        int[] arr1={155,16,77,8};
        int[] arr=findTopTwoScores(arr1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
}
