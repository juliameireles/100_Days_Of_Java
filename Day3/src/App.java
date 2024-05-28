import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
      
        
        // Creating Timer instance 
        Timer timer = new Timer();
        TimerTask ThisIsMyTask = new MyTask();
            
        long delay = 0;
        long periodOfTaskRunning = 2000; // 2 seconds

        timer.scheduleAtFixedRate(ThisIsMyTask, delay, periodOfTaskRunning);
        // scheduling task every two seconds
        



    }
}
