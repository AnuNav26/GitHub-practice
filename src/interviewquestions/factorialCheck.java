package interviewquestions;

import java.util.Scanner;

public class factorialCheck
{
    public static void main(String[] args)
    {
        // factorial of which number
        Scanner sc =new Scanner(System.in);
        int factorialOf= sc.nextInt();

        System.out.println("iterative"+iterativeFactor(factorialOf));
        System.out.println("recursive"+recursiveFactor(factorialOf));
        sc.close();
    }

    public static int recursiveFactor(int n)
    {
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*recursiveFactor(n-1);
        }
    }

    // calculation of factorial 10x9x8x7x5...1
   public static int iterativeFactor(int n)
   {
       int result=1;
       for(int i=1;i<=n;i++)
       {
           result=result*i;
           System.out.println(result);
       }
       return result;
   }
}
