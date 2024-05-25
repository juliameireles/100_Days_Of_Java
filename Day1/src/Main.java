import java.util.Random;

public class Main {
    public static void main(String[] args){
        // creating an instance
        // i can create instances anywhere in my java app
        Random generating_random = new Random();
        int range = 20;
        int Random_num_in_specific_range = generating_random.nextInt(range + 1);

       System.out.println("That's a random number within "+range+": "+Random_num_in_specific_range);


    }
}