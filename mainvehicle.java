
/**
 * Write a description of class mainvehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainvehicle
{
    public static void main(String [] args)
    {
        bike  obj = new bike();
        obj.registrationNumber = 2051;
        obj.brand ="YAMAHA";
        obj.price=270000;
        obj.numberofDoors= 0;
        obj.engineCC = 250;
        
        truck obj1 = new truck();
        obj1.loadcapacity = 50;
        
    }
}