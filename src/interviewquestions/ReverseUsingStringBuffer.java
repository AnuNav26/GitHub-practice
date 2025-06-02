package interviewquestions;

import java.util.Scanner;

public class ReverseUsingStringBuffer
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String orgStr= sc.nextLine();
        StringBuilder strb1= new StringBuilder(orgStr);
        String reversedStr= strb1.reverse().toString();
        String result= orgStr.equalsIgnoreCase(reversedStr)? orgStr+" palindrome "+reversedStr+ " and "+strb1  : orgStr+" not palindrome "+reversedStr+" and "+strb1;
        System.out.println(result);
    }

}
