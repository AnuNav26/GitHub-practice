package testInterviewQuestions;

public class FindWordFromString
{
    public static void main(String[] args) {
        String word ="Ajavaschooljavaisrobustjavajava";
        String str= "java";
        int index=word.indexOf(str);
        System.out.println(index);
        int count=0;
        while(index!=-1)
        {
            count++;
            index =word.indexOf(str,index+1);
            //System.out.println(index);
        }
        System.out.println(count);


    }

}
