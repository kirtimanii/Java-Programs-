
/**
 * Program to display pattern using for loop
 *
 * K
 * v1.0
 */
public class ws5q5
{
    public static void main(String[]args)
    {
        for(int i=1;i<=5;i++)
        {
        for(int j=1;j<=5-i;j++)
        {
        System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
        System.out.print(k);
        }
       System.out.println();
    }
}
}
