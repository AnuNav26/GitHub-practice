package interviewquestions;

import java.util.Arrays;

public class AddArrayWithNum
{
    public static void main(String[] args) {
        int[] num= {9,9,9};
        int n=0;
        int addn=9999;
        for(int i=0;i<num.length;i++)
        {
            n=(n*10)+num[i];
        }
        System.out.println(n);
        int sum=n+addn;
        System.out.println(sum);
        //Convert int to String
       String numb= Integer.toString(sum);
       System.out.println(numb.length());
       int[] digits= new int[numb.length()];
       for (int j=0;j<numb.length();j++)
       {
           digits[j]=numb.charAt(j)-'0';
       }
       System.out.println(Arrays.toString(digits));
    }

}
