// list
import java.util.*;

public class Prtc17 {
    public static void main(String[] args) {
        List<String> list1= List.of("apple","mango","grapes");
    
        List<String> list2= List.of("cat","bat","mat");
        
    List<String> list3= new ArrayList<>(list1);

    list3.addAll(list2);
    
    
        System.out.println(list3);
    }
    
}
