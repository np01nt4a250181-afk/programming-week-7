
/**
 * Write a description of class apple1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class apple1 extends apple
{
    void result()
    {
        System.out.println("This is child class");

    }
    
    public static void main(String [] args)
    {
        //for 1 
        apple obj1 = new apple();
        obj1.call();
        //for 2 
        apple1 obj = new apple1();
        obj.result();
        obj.call();
        
    }
}