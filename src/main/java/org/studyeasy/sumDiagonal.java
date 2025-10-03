package org.studyeasy;

public class sumDiagonal {
    public static void main(String[] args) {
        int[][] myArray2D= {{1,0,0},{0,1,0},{0,0,1}};

        int sum=sumDiagonalElements(myArray2D);
        System.out.println(sum);
    }
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }

        return sum;
    }
}
