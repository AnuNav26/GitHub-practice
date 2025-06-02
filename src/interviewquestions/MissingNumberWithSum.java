package interviewquestions;

import java.util.Scanner;

public class MissingNumberWithSum
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        //Actual sum
        int actualSum= num*(num+1)/2;
        System.out.println(actualSum);

        //List the array
        int[] arr= {1,2,3,5,6,8,7,9};
        //array sum
        int arrSum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            arrSum=arrSum+arr[i];
        }
        System.out.println(arrSum);

        //missing multiple numbers
        int missingNum = actualSum-arrSum;


        /*int[] arr = {1, 2, 4, 5}; // missing 3
        int n = 5;

        int xor1 = 0, xor2 = 0;
        for (int i = 1; i <= n; i++) xor1 ^= i;       // XOR of full range 1-5
        for (int val : arr) xor2 ^= val;             // XOR of actual array

        int missing = xor1 ^ xor2;                   // missing = 3*/
    }
}
