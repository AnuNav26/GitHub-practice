package interviewquestions;

public class ReverseStringWhileLoop
{
    public static void main(String[] args)
    {

        //Input String
        String str = "InterviewBit to Welcome";
        int start=0;
        int end=str.length()-1;
        System.out.println(str.length());
        char[] reversedStr = new char[end+1];
        while(start<=end)
        {
            reversedStr[end]= str.charAt(start);
            reversedStr[start]=str.charAt(end);
            start++;
            end--;
        }
        System.out.println(reversedStr);

    }
}
