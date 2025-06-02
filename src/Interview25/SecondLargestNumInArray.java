package Interview25;

public class SecondLargestNumInArray
{
    public static void main(String[] args) {
        int[] arr={1,5,23,7,9,10};
        int largNum=Integer.MIN_VALUE;
        int secondLargNum =Integer.MIN_VALUE;
        int thirdLargNum=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>largNum)
            {
                thirdLargNum=secondLargNum;
                secondLargNum=largNum;
                largNum=n;
            }
            else if((n>secondLargNum) && n!=largNum)
            {
                thirdLargNum=secondLargNum;
                secondLargNum=n;
            }
            else if(n>thirdLargNum && n!=largNum && n!=secondLargNum){
                thirdLargNum=n;
            }
        }
        System.out.println("FirstLargest number is "+largNum);
        System.out.println("SecondLargest number is "+secondLargNum);
        System.out.println("thirdLargest number is "+thirdLargNum);
    }
}
