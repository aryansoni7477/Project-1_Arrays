package org.studyeasy;

import java.util.Arrays;
import java.util.Scanner;

public class Ex {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1={1,2,3,4};
        int[] arr=middle(arr1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] middle(int[] array) {
        if(array.length<=2){
            return new int[0];
        }
        int[] result=new int[array.length-2];
        for(int i=1;i<array.length-1;i++){
            result[i-1]=array[i];
        }
        return result;
    }
}
