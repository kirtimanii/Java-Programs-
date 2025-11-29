import java.util.Scanner;

/**
 * scenario question of workshop 4
 *
 * K
 * v1.0
 */
public class ws4scenario
{
    public static void main(String[]args){
        
        int child= 50;
        int adult= 250;
        int senior= 200; 
        System.out.println("Base price for child: " +child);
        System.out.println("Base price for adult: " +adult);
        System.out.println("Base price for senior: " +senior);
        
        double studentdiscount= 0.20;
        double festivaldiscount= 0.15;
        System.out.println("Discount for student:" + studentdiscount);
        System.out.println("Discount for festival:" + festivaldiscount);
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number on the basis of your age: 1=Child, 2=Adult, 3=Senior");
        int age= scan.nextInt();
        System.out.println("Enter the number on the basis of your language 1=Nepali, 2=Hindi, 3=English");
        int language= scan.nextInt();
        System.out.println("Are you student? (1= yes, 0= no)");
        int student= scan.nextInt();
        System.out.println("Is it a festival? (1=yes, 0=no)");
        int  festival= scan.nextInt();
        
        double price = 0;
        
        if (age== 1)
        {
            price= child;
            
        }
        else if (age==2)
        {
            price= adult;
        }
        
        else if (age==3)
        {
            price= senior;
        }
        else 
        {
        System.out.println(" Invalid");
        }
        
        if (language== 2)
        {
            price= price + 50;
        }
        else
        {
            price= price + 100; 
        }
        
        if (student== 1)
        {
            price= price- (price * 0.20);
        }
        
        if (festival== 1)
        {
            price= price - (price * 0.15); 
        }
        
        System.out.println("Your total price is" +(int)price); 
    }
}