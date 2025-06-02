package Interview25;

import java.util.Arrays;

public class MoveZeroToEnd
{
    public static void main(String[] args) {
        int[] arr ={0,1,0,0,2,0,3,0,5,4,0};
        int nonzeroVal=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0)
            {
                int temp=arr[nonzeroVal];
                arr[nonzeroVal]=arr[i];
                arr[i]=temp;
                nonzeroVal++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
