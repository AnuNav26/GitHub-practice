package Interview25;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharInString
{
    public static void main(String[] args) {
        String str="hello world";
        char[] ch= str.toCharArray();
        Map<Character,Integer> freqMap= new HashMap<>();
        for(char c:ch){
            if(c!=' ')
            {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }
        for(Map.Entry<Character,Integer> mv:freqMap.entrySet()){
            System.out.println(mv.getKey()+" is shown "+mv.getValue()+" times");
        }
    }
}
