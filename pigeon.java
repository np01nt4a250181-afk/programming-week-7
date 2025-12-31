
/**
 * Write a description of class pigeon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pigeon extends bird 
{
    void havewings()
    {
        System.out.println("pigeon have wings");
    }
    
    
    public static void main(String [] args)
    {
        pigeon obj = new pigeon(); //creating object
        obj.fly(); //calling method from aves class
        obj.eat(); //calling method from bird class
        obj.havewings(); //calling its own method 
        
    }
}