import java.util.Scanner;

/**
 * Displays the reversed number at the end.
 *
 * K
 * v1.0
 */

public class ws5q9 
{
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();

        int rev = 0;

        while (num > 0) {
            int digit = num % 10;          // this %10 extract last digit  by doing the remainder and takes the last digit
            rev = rev * 10 + digit; // this after multiplying makes the revsersed number
            num = num / 10;             // this rememoves last digit
        }
        System.out.println(rev);
    }
}
