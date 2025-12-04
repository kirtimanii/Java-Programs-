
/**
 * Program to display pattern using for loop
 *
 * K
 * v1.0
 */
public class ws5q6
{
    public static void main(String[]args)
    {
        for(int i=5; i>=1; i--) //rows
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+ "\t");
            }
            System.out.println();
        }
    }
}