package interviewquestions;

import java.util.Scanner;

public class SumInputPrime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        findNum(input);
        allPrimeNum(input);
    }

    public static void findNum(int input)
    {
       /* if(input<=2)
        {
            System.out.println(input+" cannot be expressed as the sum of two prime numbers");
        }*/
        boolean found=false;
        for(int i=2;i<=input/2;i++)
        {

            if(check_prime(i)==0)
            {
                int j=input-i;
                if(check_prime(j)==0)
                {
                    System.out.println(input+" is sum of "+i+" and "+j);
                    found=true;
                }

            }
        }
        if(!found) // negative,0, are not prime numbers and 2 ,3 smallest prime number hence cant be expressed as sum of 2 numbers
        {
                System.out.println(input+" cannot be expressed as the sum of two prime numbers");
        }
    }

    /*public static int check_prime(int num)
    {
        if (num <= 1)
        {
            return 1; // negative , 0 and 1 not prime number
        }

            for (int i = 2; i <= num / 2; i++)
            {
                if (num % i == 0)
                {
                    return 1;
                }
            }
            return 0;
        }
    }*/

    public static int check_prime(int num)
    {
        if (num <= 1)
        {
            return 1; // negative , 0 and 1 not prime number
        }
        if (num > 1)
        {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                return 0;
            } else
                return 1;
        }
        return 1;
    }

    public static void allPrimeNum(int n)
    {
        System.out.println("All prime numbers up to " +n);
        for(int k=0;k<=n;k++)
        {
            if(check_prime(k)==0)
            {
                System.out.print(k+ " ");
                k++;
            }
        }
    }
}

