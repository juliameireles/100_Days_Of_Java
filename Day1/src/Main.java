import java.security.SecureRandom; //provides random numbers that are unpredictable and suitable for cryptographic operations.
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random generating_random = new Random(); // creating Random object
        int range = 20; // defining the uper limit for the range
        int Random_num_in_specific_range = generating_random.nextInt(range + 1); // using the nextInt(int inbound) method of Random class and storiging it in the variable, it generates a random number between 0 (inclusive) and 21 (exclusive)

       System.out.println("That's a random number within "+range+": "+Random_num_in_specific_range); // printing the generated number and specifying the range




    }
}