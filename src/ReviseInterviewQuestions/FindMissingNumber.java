package ReviseInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber
{
    public static void main(String[] args) {
        int[] numbers = {1,2,4,20,24,3,5,7,9,3,18,7,14};
        int lastNum= 15;
        Set<Integer> rset= addToSet(numbers);
        findNumMissing(rset,lastNum);
        findNumExtra(rset,lastNum);
    }
    public static Set<Integer> addToSet(int[] numbers){
        Set<Integer> s= new HashSet<>();
        for(int num:numbers)
        {
            s.add(num);
        }
        return s;
    }

    public static void findNumMissing(Set<Integer> rset,int lastNum)
    {

        for(int i=0;i<=lastNum;i++){
            if(!rset.contains(i))
            {
                System.out.println("missing number(s) :"+i+" \t");
            }
        }

    }

    public static void findNumExtra(Set<Integer> rset,int lastNum)
    {

        for(int n:rset){
            if(n<0|n>lastNum)
            {
                System.out.println("extra number(s) :"+n+" \t");
            }
        }
        //new comment for git hub changes

    }
}
