import java.util.ArrayList;

public class Prtc21 {
   public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    name.add("faizan");
    name.add("imran");
    name.add("kousar");
    System.out.println(name);
    name.add(1,"gowhar");
    System.out.println(name);
    name.set(1, "ikjtaj");
    System.out.println(name);
    name.remove(1);
    System.out.println(name);
    System.out.println(name.get(0));
    name.clear();
    System.out.println(name);


   } 
}
