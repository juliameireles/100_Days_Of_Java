import java.util.ArrayList;
import java.util.List;

public class RemoveItens{

    public void removeByIndex(List<String> listaPassada, int index){
      if (index >=0 && index < listaPassada.size()){ // it ensures that index is within the valid range of indices for the list. This valid range is from 0 to lidt.size() - 1
        listaPassada.remove(index);
      }else{
        System.out.println("Index out of bounds");
      }
    }
}