package testInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfSpecialChar
{
    public static void main(String[] args) {
        String str= "uaduiesgfir9o #4$%$!@^";
        char[] ch=str.toCharArray();
        char[] vowels= {'a','e','i','o','u'};
        Map<Character,Integer> countSc = new HashMap<>();
        for(char c:ch)
        {
            //if(!((c>='a') && (c<='z')||(c>='A') && (c<='Z')||(c>='0') && (c<='9')))
            //if(!(Character.isLetterOrDigit(c) || Character.isSpaceChar(c))) // to skip alphabets and numbers and spaces
            if((Character.isLetterOrDigit(c))) // to skip special characters
            {
                for(char v:vowels){
                    if(c==v){
                        if(countSc.containsKey(v)){
                            countSc.put(v,countSc.get(v)+1);
                        }
                        else countSc.put(v,1);
                    }
                    }
            }
        }
        for(Map.Entry<Character,Integer> mv :countSc.entrySet()){
            System.out.println(mv.getKey()+ "is shown "+mv.getValue()+ " time(s)");
        }

    }
}
