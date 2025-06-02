package interviewquestions;

import java.util.Scanner;

public class PalindromeRecursion
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String entryWord = sc.nextLine();
        String reversed =reverseWord(entryWord);
        if(entryWord.equalsIgnoreCase(reversed)) {
        System.out.println("Palindrome " + reversed);
        }
        else{
            System.out.println("not a palindrome "+ reversed);
        }
        sc.close();
    }

    public static String reverseWord(String word)
    {
        if(word==null || word.isEmpty())
        {
            return word;
        }
        char lastLetter = word.charAt(word.length() - 1);
        return lastLetter + reverseWord(word.substring(0, word.length() - 1));
    }
}
