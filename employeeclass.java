
/**
 * Write a description of class employeeclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employeeclass
{
    public static void main(String [] args)
    {
        employee Shahin = new employee();
        employee Sesemi = new employee();
        employee Soniya = new employee();
        
        Shahin.ID = 293823;
        Shahin.name = "Shahin Kaushar";
        Shahin.Sal = 50000f;
        
        Sesemi.ID = 384738;
        Sesemi.name = "Sesemi Limbu";
        Sesemi.Sal = 70000f;
        
        Soniya.ID = 293747;
        Soniya.name = "Soniya Adhikari";
        Soniya.Sal = 80000f;
        
        System.out.println(Shahin.ID);
        System.out.println(Shahin.name);
        System.out.println(Shahin.Sal);
        
        System.out.println(Sesemi.ID);
        System.out.println(Sesemi.name);
        System.out.println(Sesemi.Sal);
        
        System.out.println(Soniya.ID);
        System.out.println(Soniya.name);
        System.out.println(Soniya.Sal);
        
        float a = Shahin.Sal;
        if (Sesemi.Sal >a)
        {
            a = Sesemi.Sal;
        }
        if(Soniya.Sal >a )
        {
            a =Soniya.Sal;
        }
        System.out.print("Highest Salary:" + a);
        if (Soniya.Sal == a)
        {
            System.out.println("Full Name:" + Soniya.name);
            System.out.println("Salary:" + a);
        }
}
}