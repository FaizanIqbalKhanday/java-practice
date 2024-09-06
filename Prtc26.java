import java.util.HashMap;


public class Prtc26 {

    public static void main(String[] args) {
        HashMap<String, Integer> hashmap =new HashMap<>();
        String str="This is java code. This is awesome";
        String[] words =str.split(" ");
    
        
        for(String word :words){
            Integer integer=hashmap.get(word);
            if(integer==null){
                hashmap.put(word,1);
               
            }
            else
            {
                hashmap.put(word, integer+1);
            }
        }
        
       
        System.out.println(hashmap);
    }
}