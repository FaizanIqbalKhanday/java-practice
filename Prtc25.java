// polymorphysm
class Polymorphysm{
    public void functionOverloading(){
        System.out.println("this is main method");

    }
    //overriding
    public void methodOverriding(){
        System.out.println("this method is to be overriding");
    }
    //overloading
    public void functionOverloading(int a){
        System.out.println("this is overloaded method");

    }

}
class Overrdng extends Polymorphysm{
    @Override
    public void methodOverriding(){
        super.methodOverriding();
        System.out.println("this method is overridden");
    }
}
public class Prtc25 {
    public static void main(String[] args) {
        Polymorphysm p1=new Polymorphysm();
        Polymorphysm p2 =new Overrdng();
        p1.functionOverloading();
        p1.functionOverloading(2);
        p2.methodOverriding();
        
    }
}
