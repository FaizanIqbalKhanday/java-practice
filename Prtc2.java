// sum of angles of a triangle & print table of a number
class Area{
    int parameter;

    Area( Circle c1){
        
    }
}
class Circle{
    public String toString(){
        return String.format("this is %d ", parameter);
    }
    int parameter;
    float radious;
    double area;
    public void AreaOfCircle(float radious){
        this.area=0;
        this.radious=radious;
        area=(radious * radious) *3.14;
        System.err.println(area);
   }
   Circle(int parameter){
    this.parameter=parameter;
   }
}
 class Square{
    int parameter;
    int side;
    public void AreaOfSquare(int side ){
        this.side=side;
        int area;
        area=side*side;
        System.out.println(area);

    }
    Square(int parameter){
        this.parameter=parameter;
    }
 }
public class Prtc2 {

    public static void main(String args[]) {
        Circle c1=new Circle(4);
        Square s1=new Square(5);
        System.out.println(c1);
        c1.AreaOfCircle(5);
        s1.AreaOfSquare(6);
     
      
    } 
}
