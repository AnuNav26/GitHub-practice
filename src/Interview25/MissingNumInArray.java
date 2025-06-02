package Interview25;

import java.util.HashSet;
import java.util.Set;

public class MissingNumInArray
{
    public static void main(String[] args) {
        int[] numArr={1,6,8,2,4,2,9};
        int lastNum=12;
        Set<Integer> s= new HashSet<>();
        for(int num:numArr)
        {
            s.add(num);
        }
        for(int i=0;i<=lastNum;i++)
        {
            if(!s.contains(i))
            {
                System.out.println("Missing number "+i);
            }
        }
        singleNumMiss();
    }

    public static void singleNumMiss(){
        int[] num1={1,4,5,6,2,7,8,9};
        int lastNum=9;
        int sum=0;
        for(int j=1;j<=lastNum;j++)
        {
            sum=sum+j;
        }
        System.out.println(sum);
        int sum1=0;
        for(int n:num1){
            sum1=sum1+n;
        }
        System.out.println(sum1);

        System.out.println("Missing number is " +(sum-sum1));
    }
}
