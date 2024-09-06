//copy constructor
class A{
    String name;
    A(){
        name="Faizan";
        System.out.println(name);

    }
    A(A r){
        name=r.name;
        System.out.println(name);
    }

}

public class Prtc24 {
    public static void main(String[] args) {
        int a=25;
        int b =40;
        int c =a-b;
        A a1=new A();
        A a2 =new A(a1);
        System.out.println(a2);
        System.out.println(c);
        
    }
    
}
