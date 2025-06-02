package interviewquestions;

import java.util.Scanner;

public class BinarySearchTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = {1, 3, 4, 5, 7, 8, 9};
        binarySearchCheck(num);
        int index = binaryRecursive(arr, 0, arr.length - 1, num);
        if (index != -1)
        {
            System.out.println("Element found at index (recursive): " + index);
        } else
        {
            System.out.println("Element not found (recursive)");
        }
    }

    public static int binaryRecursive(int[] arr, int low, int high, int num)
    {
        if (low > high)
        {
            return -1; // not found
        }
        int m = (low + high) / 2;
        if (arr[m] == num)
        {
            return m;
        } else if (arr[m] < num)
        {
            return binaryRecursive(arr, m + 1, high, num);
        } else if (arr[m] > num)
        {
            return binaryRecursive(arr, low, m - 1, num);
        }
        return m;
    }




    public static void binarySearchCheck(int num) {
        int[] n = {1, 3,2, 4, 5, 7, 8, 9};
        int lb = 0;
        int hb = n.length - 1;
        boolean flag = false;
        while (lb <= hb) {
            int mid = (lb + hb) / 2;
            if (n[mid] == num) {
                System.out.println("Element found");
                flag = true;
                break;
            }
            if (n[mid] < num) {
                lb = mid + 1;
            }
            if (n[mid] > num) {
                hb = mid - 1;
            }
        }
        if (flag == false) {
            System.out.println("Element not found");
        }
    }


}
