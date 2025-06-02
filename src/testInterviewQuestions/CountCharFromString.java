package testInterviewQuestions;

public class CountCharFromString {
    public static void main(String[] args) {

        String str= "java program";
        char st='a';
        countOfString(st, str);
    }

    public static void countOfString(char st, String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==st){
                count++;
            }
        }
        System.out.println(count);
    }
}
