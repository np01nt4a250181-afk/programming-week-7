
/**
 * Write a description of class teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class teacher
{
    //common properties of all teacher
    int teacher_ID;
    String teacher_Name;
    String course;
    
    
    public static void main(String[] args)
    {
        teacher ujjwal = new teacher();
        teacher Dhruva = new teacher();
        teacher Sashwat = new teacher();
        
    //Shahin object
    ujjwal.teacher_ID = 3874982;
    ujjwal.teacher_Name = "Ujjwal Subedi";
    ujjwal.course = "Programming";
    
    Dhruva.teacher_ID = 2847043;
    Dhruva.teacher_Name = "Dhruva Pandey";
    Dhruva.course = "Introduction to Networks";
    
    Sashwat.teacher_ID = 2387474;
    Sashwat.teacher_Name = "Sashwot Shahi";
    Sashwat.course = "CyberSecurity";
    
    
    
}
}