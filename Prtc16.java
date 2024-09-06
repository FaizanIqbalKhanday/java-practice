// polymorphism
abstract class Animals1{
    abstract void bark();
}
class Dog extends Animals1{

    @Override
    void bark() {
       System.out.println("bow bow");
        
    }

}
class Cat extends Animals1{

    @Override
    void bark() {
        System.out.println("mew mew");
        
    }

}
public class Prtc16 {
    public static void main(String[] args) {
        Animals1[] animals= {new Cat(), new Dog()};
        for(Animals1 animal :animals){
            animal.bark();
        }
       
        
    }
    
}
