/*Programmer: Austin Parker Date: June 24,2020
Assignment: PE 8.10 largestRowAndColumn
Description: Program that generates random 1's and 0's then, displays largest row and column based on number count*/

public class largestRow {
    public static void main(String[] args)
    {
        //creates 4 by 4 matrix
        int[][] matrix = new int[4][4];
        //variables for matrix
        int largestRI = 0;
        int largest = -1;
        //for loop generates random 1's and 0's to fill matrix
        for (int i = 0; i < matrix.length; i++)
        {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = (int)(Math.random() * 2);
                rowCount += matrix[i][j];
            }
            if (rowCount > largest)
            {
                largestRI = i;
                largest = rowCount;
            }
        }
        // for loop finds the largest index column
        int largestCI = 0;
        largest = -1;
        for (int k = 0; k < matrix[0].length; k++)
        {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++)
            {
                columnCount += matrix[i][k];
            }
            if (columnCount > largest)
            {
                largest = columnCount;
                largestCI = k;
            }
        }
        // displays the matrix
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.printf("%d", matrix[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("The largest row index: " + largestRI);
        System.out.println("The largest column index: " + largestCI);
    }
}
