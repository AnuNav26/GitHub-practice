package interviewquestions;

public class CountSpaces
{
    public static void main(String[] args) {
        String input = " Welcome  to InterviewBit";

        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces between words: " + spaceCount);
    }
}
