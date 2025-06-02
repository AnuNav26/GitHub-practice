package interviewquestions;

import java.util.Scanner;

public class FibonacciSeriesCheck
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        int term= sc.nextInt();
        //Generate fibonacci
        int[] fibArr= new int[term];
        for(int i=0;i<term;i++)
        {
            fibArr[i]=fibonacci(i);
        }
        //create 3x3 matrix and print
        int[][] matrix= new int[3][3];
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j]= fibArr[k];
                k++;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
