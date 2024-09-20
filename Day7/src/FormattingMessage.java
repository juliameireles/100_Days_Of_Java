//Formatting a message using MessageFormat
import java.text.MessageFormat;

public class FormattingMessage {
    public static void main(String[] args){

    String message = "Hey {0}, you got {1} messages, press {2} to start listening all of them";

    String result = MessageFormat.format(message, "Gabriela","6","space");

    System.out.println(result);

     System.out.println("\n");

    System.out.println("=========FORMATANDO MENSAGEM USANDO FUNÇÃO=======");

  showTheMessage("Luana","New York","20");
    }

    private static void showTheMessage(String string1,String string2,String string3){
        String SecondMessage = " Im {0} ,I live in {1} and Im {2} years old";
        String result2 = MessageFormat.format(SecondMessage,string1,string2,string3);
        System.out.println(result2);
    }
}
