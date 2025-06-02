package interviewquestions;

import java.util.Scanner;

public class MagicNumberCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt(); //199
        int result= num;
        while(result>9)
        {
            result= sumOfDigits(result);
        }
        if (result==1){
            System.out.println(num+" is a Magic number");
        }
        else
            System.out.println(num+" is not a Magic number");
    }

    public static int sumOfDigits(int num){
        int sum=0;
        //identify each digit and sum them
        while(num>0){
            sum=sum+num%10; //9 , 9(9+9), 18+1 // 9,1 //0,1
            num=num/10; //19, 1, 0 //1,0//1,0
        }
        return sum; //19 //10 //
    }

}
