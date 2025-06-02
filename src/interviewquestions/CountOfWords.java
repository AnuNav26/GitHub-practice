package interviewquestions;

import java.util.Scanner;

public class CountOfWords
{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sentence= sc.nextLine();
        String str="java";
        countWords(sentence);
        countWordsUsingCharAt(sentence);
        countJavaUsingIndexOf(sentence,"java");
        countJavaUsingReplace(sentence,"java");
    }

    public static void countWords(String sentence)
    {
        int count=0;
        String[] words= sentence.split("\\s+");
        System.out.println("count of words using split "+ words.length);
       for(int i=0;i<=words.length-1;i++)
       {
           count++;

        }
       System.out.println();
       System.out.println("count of words using forloop "+count);

    }

    public static void countWordsUsingCharAt(String sentence)
    {
        int count=1;
        for(int i=0; i<=sentence.length()-1;i++)
        {
            if((sentence.charAt(i)==' ') && (sentence.charAt(i+1)!=' '))
            {
                count++;
            }

        }
        System.out.println("count of words using charAt "+count);

    }

    public static void countJavaUsingIndexOf(String sentence,String str)
    {

       int index= sentence.toLowerCase().indexOf(str);
       int count=0;
       while(index!=-1)
       {
           count++;
           index=sentence.toLowerCase().indexOf(str,index+1);
       }
   System.out.println("using index of " +count);
    }

    public static void countJavaUsingReplace(String sentence, String str)
    {
        int totalLength= sentence.length();
        int count_afterremove=sentence.replace(str,"").length();
        int totalcount=totalLength-count_afterremove;
        System.out.println("using replace " +totalcount/str.length());



    }
}
