package Interview25;

public class ReverseTheNumbers
{
    public static void main(String[] args)
    {
        int number=2147483647;
        int lastdigit;
        int reverseNumb = 0;
        while(number!=0)
        {
            lastdigit = number % 10;
            if((reverseNumb>Integer.MAX_VALUE/10)||reverseNumb==Integer.MAX_VALUE && lastdigit>7)
            {
                System.out.println(0);
                System.exit(0);
            }
            if((reverseNumb<Integer.MIN_VALUE/10)||reverseNumb==Integer.MIN_VALUE && lastdigit<-8)
            {
                System.out.println(0);
                System.exit(0);
            }
            reverseNumb = (reverseNumb * 10) + lastdigit;
            number = number / 10;
        }
        System.out.println(reverseNumb);
    }
}
