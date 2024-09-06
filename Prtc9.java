// area and parameter of a rectangle
class Rectangle{
    private int length;
    private int width;

    public String toString(){
        return String.format("length of a rectangle is %d \nwidth is %d\narea is %d\nparameter is %d ", length,width,area(),Parameter());
    }
    public int area(){
        return length*width;
    
    }
    public int Parameter(){
        return 2*(length+width);
    }
   

   Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
}
public class Prtc9 {
    public static void main(String[] args) {
       
        Rectangle rec=new Rectangle(6,4);
        System.out.println(rec);
    }

    
}
