
/**
 * Write a description of class rectangleclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangleclass
{
    public static void main (String [] args)
    {
        rectangle side_1 = new rectangle();
        rectangle side_2 = new rectangle();
        
        side_1.length = 4f;
        side_1.breadth = 2f;
        side_1.area = side_1.length * side_1.breadth;
        
        side_2.length = 3f;
        side_2.breadth = 2f;
        side_2.area = side_2.length * side_2.breadth;
        
        System.out.println("area of rectangle :" + side_1.area);
        System.out.println("area of rectangle :" + side_2.area);
        

        
        
    }
}