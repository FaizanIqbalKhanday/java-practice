// interfaces
interface Flayable{
    public void birds();
    public void aeroplane();
}
class Fly implements Flayable{

    @Override
    public void aeroplane() {
       System.out.println("with wings");
        
    }

    @Override
    public void birds() {
        System.out.println("with fuel");
        
    }

}
public class Prtc15 {
    public static void main(String[] args) {
        Flayable fly=new Fly();
        fly.aeroplane();
        fly.birds();
        
    }
    
}
