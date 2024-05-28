import java.time.format.*; // package used for various things like converting data-time objects into strings  according  to specified patterns 
import java.time.LocalDateTime;

public class Main  {
    public static void main(String[] args) throws Exception {
       

        // creating a Local Data Time Object 
        // now() is a method that returns the corrent dante and time 
        LocalDateTime CurrentTime = LocalDateTime.now();


        // defining desired  pattern
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
     
        // formatting the LocalDataTime Object 
       String FormattedCurrentTime = CurrentTime.format(formatador);
    System.out.println(FormattedCurrentTime);
    
    
    }








}
