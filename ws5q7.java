import java.util.Scanner;

/**
 * Program to perform arithmetic operations using while loop
 *
 * K
 * v1.0
 */
public class ws5q7
{
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);    
        System.out.println("Should we do some math? y or n");
        char category = scan.next().charAt(0);
        
        
        while (category == 'y')
        {
            System.out.println("Enter a number");
            int firstno= scan.nextInt();
            System.out.println("Enter second number");
            int secondno= scan.nextInt();
            
            int sum=firstno+secondno;
            int diff=firstno-secondno;
            int pro=firstno*secondno;
            
            System.out.println("The sum of two numbers is " +sum);
            System.out.println("The difference of two numbers is" +diff);
            System.out.println("The product of two numbers is" +pro);
            
            System.out.println("Do u want to proceed? y or n");
            category = scan.next().charAt(0);
        
            
        }
    
        
    }
}
