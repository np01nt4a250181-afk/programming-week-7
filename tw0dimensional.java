
/**
 * Write a description of class tw0dimensional here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tw0dimensional
{
    public static void main (String [] args ){
        int [][] arr = {{1,2,3},{3,4,5},{5,6,7}};
        //for row 
        for (int i = 0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                System.out.print(arr[i][j]);
            }
            
            System.out.println();
        }
    }
}
