package org.studyeasy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("How many day's temperature?");
        int numdays= console.nextInt();
        int[] temps=new int[numdays];
        int sum=0;
        for(int i=0;i<numdays;i++){
            System.out.println("Day "+(i+1)+" Highest temperature:");
            temps[i]=console.nextInt();
            sum+=temps[i];
        }
        double average=sum/numdays;
        System.out.println("The average temperature is "+average);
        int above=0;
        for(int i=0;i<temps.length;i++){
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println(above+" day has more than average temperature");
    }
}