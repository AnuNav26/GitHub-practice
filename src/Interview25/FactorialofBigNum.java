package Interview25;

import java.math.BigInteger;

public class FactorialofBigNum
{
    public static void main(String[] args)
    {
        int num=50;
        BigInteger factOfNum=BigInteger.ONE;
        for(int i=1;i<=num;i++)
        {
            factOfNum=factOfNum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factOfNum);

        int num1=10;
        int factOfNum1=1;
        for(int i=1;i<=num1;i++)
        {
            factOfNum1=factOfNum1*i;
        }
        System.out.println(factOfNum1);
    }
}
