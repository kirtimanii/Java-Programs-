
/**
 * Write a description of class loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loop
{
    public static void main(String[]args)
    {
        for(int i=1; i<=3; i++)
        {
            for(int j=1; j<=3; j++)
            {
                if(j==2)
                {
                    break;
                }
                System.out.println("");
            }
        }
    }
}