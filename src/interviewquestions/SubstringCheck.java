package interviewquestions;

import java.util.Scanner;

public class SubstringCheck
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String words= sc.nextLine();
        getSubstringOfWords(words);
        getSubstringUsingSplit(words);
    }

    public static void getSubstringOfWords(String words)
    {
        for(int start=0;start<=words.length()-1;start++)
        {
            for(int end=start+1;end<=words.length();end++)
            {
                String subst= words.substring(start,end);
                System.out.println(subst);
            }
        }
    }

    public static void getSubstringUsingSplit(String sentence)
    {
        String[] word = sentence.split("\\s+");
        for(int start=0;start<word.length;start++)
        {
            String sub="";
            for(int end=start;end<word.length;end++)
            {
            sub=sub+word[end]+" ";
            System.out.println(sub.trim());
            }
        }
    }

}
