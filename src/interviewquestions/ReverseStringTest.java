package interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringTest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words= sc.nextLine();
        String anotherWord=sc.nextLine();
        String noSpaceWord=cleanUpSpaces(words);
        String noSpaceAnotherWord=cleanUpSpaces(anotherWord);
        String reversed = getReversed(noSpaceWord);
        checkPalindrome(noSpaceWord,reversed);
        anagramCheck(noSpaceWord,noSpaceAnotherWord);
    }

    public static String getReversed(String words)
    {
        String reversed="";
        for(int i=words.length()-1;i>=0;i--)
        {
            char ch= words.charAt(i);
            reversed= reversed+ch;
        }
        System.out.println(reversed+ " is a reverse of "+words);
        return reversed;

    }

    public static void checkPalindrome(String orgWord, String reversedWord)
    {
        if (orgWord.equalsIgnoreCase(reversedWord))
        {
            System.out.println(orgWord+ " is a palindrome");
        }
        else System.out.println(orgWord+ " is not a palindrome");
    }

    public static String cleanUpSpaces(String words)
    {
        String result="";
        for(int i=0;i<=words.length()-1;i++){
            char ch=words.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
            result= result+ch;
            }
        }
        return result;
    }

    public static void anagramCheck(String word, String anotherWord)
    {
        if(word.length()!=anotherWord.length())
        {
            System.out.println(word+" and "+ anotherWord+ " are not an anagram");
        }
        //Sort the characters
        char[] str1= word.toCharArray();
        char[] str2= anotherWord.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)){
        System.out.println(word+" and "+ anotherWord+ " are an anagram");
        }
        else {
            System.out.println(word + " and " + anotherWord + " are not an anagram");
        }

    }

}
