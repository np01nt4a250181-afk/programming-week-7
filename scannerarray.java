
/**
 * Write a description of class scannerarray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */import java.util.Scanner;
public class scannerarray
{
    public static void main(String[] args)
    {
        String[] teacher ={"Renu","Ujjwal","Rita","Resham","Rashmi"};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a new name");
        String newteacher = sc.nextLine();
        teacher[4]="Sesemi";
        for (int i=0; i<=4; i++)
        {
            System.out.println(teacher[i]);
        }
    }
}