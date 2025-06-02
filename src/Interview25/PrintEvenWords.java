package Interview25;

public class PrintEvenWords
{
    public static void main(String[] args) {
        String str="sky is blue and red";
        String[] words=str.split(" ");
        for(String word: words){
            int lenStr=word.length();
            if(lenStr%2==0){
                System.out.println(word+" Word is a even");
            }
            /*else
                System.out.println(word+" Word is odd");*/
        }

    }
}
