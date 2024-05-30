// IMPORT REQUIRED CLASSES
import java.util.ArrayList;
import java.util.List;
//mport java.util.Iterator;

public class Main {
    public static void main(String[] args) {
      List<String> Cities = new ArrayList<>();
      RemoveItens remove = new RemoveItens();

      Cities.add("Brasilia");
      Cities.add("Florianópolis");
      Cities.add("São Paulo");
      Cities.add("Belo Horizonte");
      Cities.add("Rio de Janeiro");

      // removing the second one with remove method
       remove.removeByIndex(Cities, 1);
       System.out.println("Removing Florianópolis: "+Cities);

       // removing the fifth one with remove method
       remove.removeByIndex(Cities, 3);
       System.out.println("Removing Rio de Janeiro: "+Cities);

        // removing the third one remove method
        remove.removeByIndex(Cities, 1);
        System.out.println("Removing São Paulo: "+Cities);

      // removing the forth one remove method
       remove.removeByIndex(Cities, 1);
       System.out.println("Removing Belo Horizonte: "+Cities);


       
    }

}
