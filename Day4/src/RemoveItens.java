import java.util.ArrayList;
import java.util.List;

public class RemoveItens{

    public void removeByIndex(List<String> listaPassada, int index){
      if (index >=0 && index <= listaPassada.size()){
        listaPassada.remove(index);
      }else{
        System.out.println("Index out of bounds");
      }
    }
}