package interviewquestions;

import java.util.Scanner;

public class AnyDegRotMatrix
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int[][] matrixElements= enterElements(n,sc);
        System.out.println(matrixElements.length);
        System.out.println("Org Matrix");
        printMatrix(matrixElements);
        System.out.println("transpose matrix");
        transposeMatrix(matrixElements);
        printMatrix(matrixElements);
       System.out.println("reverse matrix 90 degree");
       reverseRow(matrixElements);
        printMatrix(matrixElements);
        System.out.println("reverse matrix 180 degree");
        rotate180(matrixElements);
        printMatrix(matrixElements);
    }

  public static int[][] reverseRow(int[][] matrixElements)
    {
        for(int[] row: matrixElements)
        {
            int start=0;
            int end=row.length-1;
            while(start<=end)
            {
                int temp=row[start];
                row[start]=row[end];
                row[end]=temp;
                start++;
                end--;
            }
        }
        return matrixElements;
    }

    public static int[][] transposeMatrix(int[][] matrixElements)
    {
        for(int i=0;i<=matrixElements.length-1;i++)
        {
            for(int j=i;j<=matrixElements.length-1;j++)
            {
                int temp=matrixElements[i][j];
                matrixElements[i][j]=matrixElements[j][i];
                matrixElements[j][i]=temp;
            }
        }
        return matrixElements;
    }



   /* public static void printMatrix(int[][] matrixElements) {
        for (int[] row : matrixElements) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }*/

    public static void printMatrix(int[][] matrixElements)
    {
        for(int row=0;row<=matrixElements.length-1;row++)
        {
            for(int col=0;col<=matrixElements.length-1;col++){
                int i = matrixElements[row][col];
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] enterElements(int n, Scanner sc)
        {
        int[][] input= new int[n][n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                input[i][j]=sc.nextInt();
            }
        }
        return input;
    }

    public static void rotate180(int[][] matrixElements) {
        int rows = matrixElements.length;
        int cols = matrixElements[0].length;

        // Swap elements from start to end
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = matrixElements[i][j];
                matrixElements[i][j] = matrixElements[rows - 1 - i][cols - 1 - j];
                matrixElements[rows - 1 - i][cols - 1 - j] = temp;
            }
        }

        // If odd number of rows, reverse the middle row
        if (rows % 2 != 0) {
            int midRow = rows / 2;
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrixElements[midRow][j];
                matrixElements[midRow][j] = matrixElements[midRow][cols - 1 - j];
                matrixElements[midRow][cols - 1 - j] = temp;
            }
        }
    }
}
