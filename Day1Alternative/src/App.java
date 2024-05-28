import java.security.SecureRandom;
public class App {
    private static SecureRandom anotherRandom = new SecureRandom();
    public static void main(String[] args){

System.out.println("Generating a random number between 40 and 50");
System.out.println(GeneratingRandomBetween(40,50));
// The difference maximum - minimum is calculated to determine the size of the range.
// nextInt((50 - 40)) + 40
// nextInt(10) - isso gera um numero aletorio entre 0 a 9 
// 5 + 40 
// numero aleatorio gerado = 45

//nextInt((50 - 40)) + 40
// nextInt(10) - isso gera um numero aletorio entre 0 a 9 

// 9 + 40
// numero aleatorio gerado = 49      
    }


    
// creating a method to generate a a random number at a specific range 
public static int GeneratingRandomBetween(int minimum,int maximum){
    return anotherRandom.nextInt((maximum - minimum))  + minimum; // inclusive of the minimum and exclusive of the maximum
}
}
