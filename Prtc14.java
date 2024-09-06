// interfaces
interface gamingConsole{
    public void up();
    public void down();
    public void left();
    default void right(){}

}
class marioGame implements gamingConsole{

    @Override
    public void down() {
       System.out.println("move backward");
        
    }

    @Override
    public void left() {
        System.out.println("move left");
        
    }

    @Override
    public void up() {
        System.out.println("move forward");
        
    }

}
class chessGame implements gamingConsole{

    @Override
    public void down() {
        System.out.println("move backward");
        
    }

    @Override
    public void left() {
        System.out.println("move backward");
        
    }

    @Override
    public void right() {
        System.out.println("move backward");
        
    }

    @Override
    public void up() {
        System.out.println("move backward");
        
    }

}
public class Prtc14 {
    public static void main(String[] args) {
        chessGame game=new chessGame();
       // marioGame game =new marioGame();
        game.down();
        game.up();
        game.right();
        game.left();
        
    }
}
