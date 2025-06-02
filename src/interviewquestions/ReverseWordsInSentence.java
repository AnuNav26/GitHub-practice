package interviewquestions;

import java.util.Scanner;

public class ReverseWordsInSentence
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String sentence= sc.nextLine();
        revSentenceTest(sentence);
    }

    public static void revSentenceTest(String sentence)
    {
        String[] words=sentence.split("\\s+");
        for(int i=words.length-1;i>=0;i--)
        {
            System.out.print(words[i]);
            if(i!=0)
            {
                System.out.print(" ");
            }
        }

    }
}
