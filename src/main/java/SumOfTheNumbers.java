import java.util.Scanner;

/**
 * Created by jonathanleczner on 9/10/16.
 */
public class SumOfTheNumbers {
    public static void main(String[] args) {
        SumOfTheNumbers sumOfTheNumbers = new SumOfTheNumbers();
        sumOfTheNumbers.promptUser();
        int n = sumOfTheNumbers.getInput();
        int sum = sumOfTheNumbers.sumToN(n);
        System.out.println("The sum of the numbers is: " + sum);
    }

    public void promptUser() {
        System.out.println("Enter a number:");
    }

    public int getInput() {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        return number;
    }

    public int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
}
