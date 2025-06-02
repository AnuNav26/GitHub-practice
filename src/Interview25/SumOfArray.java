package Interview25;

public class SumOfArray
{
    public static void main(String[] args) {
        int[] numArr= {1,24,33,44};
        int sum =0;
        for(int i=0;i<numArr.length;i++){
            sum=sum+numArr[i];
        }
        System.out.println("Sum of Array is "+sum);
    }
}
