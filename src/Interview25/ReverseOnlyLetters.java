package Interview25;

import java.util.Arrays;

public class ReverseOnlyLetters
{
    public static void main(String[] args) {
        String str= "ab123CD5";
        char[] ch = str.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end)
        {
            if(!Character.isLetter(ch[start]))
            {
                start++;
            }
            else if(!Character.isLetter(ch[end])){
                end--;
            }
            else{
                char temp= ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(ch));
    }
}
