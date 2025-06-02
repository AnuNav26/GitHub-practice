package Interview25;

public class SwapNumbers
{
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        System.out.println(a+ " a and b value "+b);
        //swap
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+ " a and b value "+b);

        //swap2 a=10, b=20
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ " a and b value "+b);

    }
}
