package interviewquestions;

public class TowerOfHanoiTest
{
    static int stepCount = 0;

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            stepCount++;
            System.out.println("Step " + stepCount + ": Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveHanoi(n - 1, source, destination, auxiliary);
        stepCount++;
        System.out.println("Step " + stepCount + ": Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numDisks = 5;  // You can change this value to 4, 5, etc.
        System.out.println("Steps to solve Tower of Hanoi with " + numDisks + " disks:");
        solveHanoi(numDisks, 'S', 'A', 'D');
        System.out.println("Total number of steps: " + stepCount);
    }
}
