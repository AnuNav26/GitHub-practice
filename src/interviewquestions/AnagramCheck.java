package interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck
{


            public static void main(String[] args)
            {
                Scanner sc= new Scanner(System.in);
                String str1= sc.nextLine();
                String str2 =sc.nextLine();
                //String noSpacesOrgWord= removeSpaces(orgWord);
                String noSpaceStr1= cleanInput(str1);
                String noSpaceStr2= cleanInput(str2);
                if(areAnagram(noSpaceStr1,noSpaceStr2))
                {
                    System.out.println(str1+ " is anagram of "+str2);
                }
                else{
                    System.out.println(str1+ " is not anagram of " +str2);
                }
                sc.close();
            }
            public static boolean areAnagram(String str1,String str2)
            {
                //check length
                if(str1.length()!=str2.length())
                {
                    return false;
                }
                //Sort
                char[] a=str1.toCharArray();
                char[] b=str2.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                // compare
                boolean isanagram= Arrays.equals(a,b);
                return isanagram;
            }

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



