
/**
 * Program to display series of 2,4,6 using for loop, while loop and do while loop
 *
 * K
 * v1.0
 */
public class ws5q1
{
    public static void main(String[] args) 
    {

        for (int i = 1; i <= 10; i++)  // for loop
        {
            System.out.println(2* i);
        }
        System.out.println("\n");
        int j = 1;
        while (j <= 10)  // while loop
        {
            System.out.println(2* j);
            j++;
        }
        System.out.println("\n");
        int k = 1;
        do  // do while loop
        {
            System.out.println(2* k);
            k++;
        } while (k <= 10);
    }
}