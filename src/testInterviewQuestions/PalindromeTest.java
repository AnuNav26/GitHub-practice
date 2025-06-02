package testInterviewQuestions;

public class PalindromeTest
{
    public static void main(String[] args)
    {
        //"A man, a plan, a canal: Panama";
        String str= "noon";
        String noSpaceStr= cleanUpStr(str);
        String reverseStr= getReverseStr(noSpaceStr);
        isPalindromeOrNot(str,noSpaceStr,reverseStr);
        String reverseRecursive= getReverseStrRecursive(noSpaceStr);
        isPalindromeOrNot(str,noSpaceStr,reverseRecursive);
    }

    public static void isPalindromeOrNot(String str,String noSpaceStr, String reverseStr)
    {
        if(noSpaceStr.equalsIgnoreCase(reverseStr)){
            System.out.println(str+ " is a palindrome");
        }
        else System.out.println(str+ " is  not a palindrome");
    }

    public static String cleanUpStr(String str)
    {
        String str1="";
        for(int i=0;i<=str.length()-1;i++)
        {
            char ch= str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                str1=str1+ch;
            }
        }
        return str1.toLowerCase();
    }

    public static String getReverseStr(String str)
    {
        String reverseStr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch1=str.charAt(i);
            reverseStr=reverseStr+ch1;

        }
        System.out.println(reverseStr);
        return reverseStr;
    }

    public static String getReverseStrRecursive(String str)
    {

        int start=0;
        int end=str.length()-1;
        if(str==null| str.isEmpty())
        {
            return str;
        }
        char lastChar= str.charAt(end);
        String word2=lastChar+getReverseStrRecursive(str.substring(start,end));
        return word2;

    }


}
