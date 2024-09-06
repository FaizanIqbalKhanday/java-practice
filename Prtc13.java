// abstract
abstract class AbstractClass{
    public  void exicute(){
        getREady();
        doThedish();
        clean();
    }
    abstract void getREady();
    abstract void doThedish();
    abstract void clean();
}
class Rciepe1 extends AbstractClass{

    @Override
    void getREady() {
       System.out.println("bring the vegitables");
        
    }

    @Override
    void doThedish() {
        System.out.println(" cook the dish");

        
    }

    @Override
    void clean() {
       System.out.println("clean the uitincles");
        
    }

}
public class Prtc13 {
    public static void main(String[] args) {
        Rciepe1 a=new Rciepe1();
        a.getREady();
        a.doThedish();
        a.clean();
        
    }
    
}
