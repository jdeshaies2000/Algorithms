/*
    Homework: Week 1 - Day 3 - Algorithms #5

    5. Print a multiplication table from 1 to 10 using multidimensional array
    Output
    1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    ...
    public void printTables(){};
*/

import java.util.*;

class MultiMatrix {

    public static int[][] generateMatrix(int rows, int cols) {

        int [][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length ; row++)
        {
            for (int column = 0; column < matrix[row].length; column++)
            {
                matrix[row][column] = (row+1)*(column+1);
            }
        }
        return matrix;
    }

    public static void printTables(int matrixData[][]) {

        for (int row = 0; row < matrixData.length ; row++)
        {
            for (int column = 0; column < matrixData[row].length; column++)
            {
                System.out.printf("%3d ", matrixData[row][column]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] data = new int[10][10];
        data = generateMatrix(10,10);
	printTables(data);
    }
}

/*
    OUTPUT:

    MacBook-Pro-7:Documents filedemployee$ java MultiMatrix.java
      1   2   3   4   5   6   7   8   9  10 
      2   4   6   8  10  12  14  16  18  20 
      3   6   9  12  15  18  21  24  27  30 
      4   8  12  16  20  24  28  32  36  40 
      5  10  15  20  25  30  35  40  45  50 
      6  12  18  24  30  36  42  48  54  60 
      7  14  21  28  35  42  49  56  63  70 
      8  16  24  32  40  48  56  64  72  80 
      9  18  27  36  45  54  63  72  81  90 
     10  20  30  40  50  60  70  80  90 100 
    MacBook-Pro-7:Documents filedemployee$
*/
