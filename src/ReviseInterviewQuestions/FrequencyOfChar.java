package ReviseInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar
{
    public static void main(String[] args)
    {
        String str ="agAbd#q@eusi@1";
     /*   Map<Character, Integer> countChar =getCountOfChar(str);
          for(Map.Entry<Character,Integer> mc: countChar.entrySet()){
              System.out.println(mc.getKey()+" is shown "+mc.getValue()+" times");
    }*/
        Map<Character, Integer> vowelCount= getVowelsList(str);
        for(Map.Entry<Character,Integer> vc: vowelCount.entrySet()){
            System.out.println(vc.getKey()+" is shown "+vc.getValue()+" times");
        }
    }

    public static Map<Character,Integer> getCountOfChar(String str){
        char[] ch = str.toCharArray();
        Map<Character,Integer> countMap=  new HashMap<Character,Integer>();
        for(char c: ch)
        {
          countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        return countMap;
    }

    public static Map<Character, Integer> getVowelsList(String str){
        char[] vowels= {'a','e','i','o','u'};
        char[] strCh= str.toLowerCase().toCharArray();
        Map<Character,Integer> countMap=  new HashMap<Character,Integer>();
        for(char ch1:strCh)
        {
            for(char v: vowels){
                if(ch1==v) {
                    countMap.put(v, countMap.getOrDefault(v, 0) + 1);
                }
            }
        }
        return countMap;
    }
}
