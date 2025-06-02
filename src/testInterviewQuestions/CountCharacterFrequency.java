package testInterviewQuestions;

import java.util.*;

public class CountCharacterFrequency
{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //String word= sc.nextLine();
        String word = "hello";
        getLetterCount(word);
    }

    public static void getLetterCount(String word)
    {
        Map<Character,Integer> freqMap= new HashMap<>();
        char[] letters= word.toCharArray();
        for(char c:letters)
        {
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> m:freqMap.entrySet()){
        System.out.println(m.getKey()+ " is shown"+ m.getValue()+" times");
        }

    }
}
