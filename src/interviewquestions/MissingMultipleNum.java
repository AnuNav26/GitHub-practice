package interviewquestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingMultipleNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        //List array elements
        int[] arr={0,2,3,6,7,9,2,8,12};
        // Store in Hashset
        Set<Integer> s=new HashSet<>();
        for(int val:arr)
        s.add(val);
        //missing numbers
        System.out.println("missing numbers in set");
        for(int i=0;i<=num;i++)
        if(!s.contains(i))
        {
            System.out.print(i+ "\t");
        }
        System.out.println(" ");
        //extra numbers in arr
        System.out.println("Extra numbers in set");
        for(int n:s)
        {
            if(n<=0||n>num)
            {
                System.out.print(n+"\t");
            }
        }
    }
}
