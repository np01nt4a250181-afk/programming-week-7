
/**
 * Write a description of class scooby here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scooby extends dogs
{
    int id;
    public static void main(String [] args)
    {
        scooby obj = new scooby();//creating new object
        obj.name ="scooby do-bi-boo";
        obj.color ="golden";
        obj.id = 7; //add variable of scooby class 
        
        
        //calling method 
        obj.bark();
        
    }
}