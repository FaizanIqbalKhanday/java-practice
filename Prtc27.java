
//reverse of string

public class Prtc27 {
  public static void reverseOfString(int index ,char [] str){
    if(str==null || index>=str.length){
      return;
    }
    reverseOfString(index+1, str);
    System.out.print(str[index]+" ");

  }
    public static void main(String[] args) {
      char[] str={'f','a','i','z','a','n'};
      int index=0;
      reverseOfString(index, str);
    
       
    }
    
}
