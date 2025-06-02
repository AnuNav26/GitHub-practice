package interviewquestions;

import java.util.Scanner;

public class PalindromeIterative
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String orgWord= sc.nextLine();
        //String noSpacesOrgWord= removeSpaces(orgWord);
        String noSpacesOrgWord= cleanInput(orgWord);
        String reversedWord= reverseWord(noSpacesOrgWord);
        if(noSpacesOrgWord.equalsIgnoreCase(reversedWord))
        {
            System.out.println("palindrome "+reversedWord);
        }
        else{
            System.out.println(noSpacesOrgWord+ " is not same as " +reversedWord);
        }
        sc.close();
    }
   public static String reverseWord(String word)
   {
       String  reversed= "";
       for (int i = word.length() - 1; i >= 0; i--)
       {
           char ch = word.charAt(i);
           reversed = reversed+ch;
       }
       return reversed;
   }

  /*public static String removeSpaces(String word)
  {
       String  result= "";
       for (int i =0; i<=word.length()-1; i++)
       {
           char ch = word.charAt(i);
           if(ch!=' ')
           {
               result = result + ch;
           }
       }
       return result;
   }*/


    public static String cleanInput(String word)
    {
        String result = "";
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if (Character.isLetterOrDigit(ch))
            {
                result += ch;
            }
        }
        return result;
    }
}
