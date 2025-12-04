
/**
 * Program to find the sum of the square of first 10 natural numbers using do-while loop
 *
 * K
 * v1.0
 */
public class ws5q3
{
    public static void main(String[] args) 
    {
        int i = 1;
        int sum=0;
        do  // do while loop
        {
            sum=sum+(i*i);
            i++;
        } while (i <= 10);
        System.out.println(sum);
    }
}