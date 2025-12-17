
/**
 * Write a description of class squareedowhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class squareedowhile
{
    public static void main(String[] args)
    {
        int n=1;
        int sum=0;
        do
        {
            sum=sum+(n*n);
            n++;
        }while(n<=10);
        System.out.println("Sum of squares:"+sum);
    }
}