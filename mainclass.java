
/**
 * Write a description of class mainclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainclass
{
    public static void main(String [] args)
    {
        book Social = new book();
        book Science = new book();
        
        Social.title = "Studies of Human Behaviour";
        Social.author = "Shahin Kaushar";
        Social.price = 445;
        
        Science.title ="Concepts of Environment";
        Science.author = "Soniya Adhikari";
        Science.price = 550;
        
    
        System.out.println("title:" +Social.title);
        System.out.println("author:" + Social.author);
        System.out.println("price:" +Social.price);
        
        
        System.out.println("title:" + Science.title);
        System.out.println("author:" + Science.author);
        System.out.println("price:" +Science.price);
    }
    
}