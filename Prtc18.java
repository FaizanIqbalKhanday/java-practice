// Exceptions : try and catch
public class Prtc18 {
    
    public static void main(String[] args) {
        int a=10,b=0,c;
        String str ="null";
        String msg= "Faizan";
        try{
            int m=Integer.parseInt(msg);
            System.out.println(m);
        }
        catch(NumberFormatException n){
            System.out.println("string can't not be converted into integer");
        }
        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException n){
            System.out.println("null can't can't be change");
        }
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("it is not allowed to divide by zero ");
        }



    }
    
}
