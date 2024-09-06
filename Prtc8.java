// oop tostring.
class Fan{
    private String make;
    private String color;
    private double radious;
    private boolean isOn;
    private byte speed;

    public String toString(){
        return String.format("make- %s, color- %s, radius- %f, isOn- %b, speed- %d", make,color,radious,isOn,speed);
    }

    public void switchOn(){
        this.isOn=true;
    }
    public void switchOff(){
        this.isOn=false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed){
        this.speed=speed;
    }

    Fan(String make, String color, double radious){
        this.make=make;
        this.color=color;
        this.radious=radious;
    }

}
public class Prtc8 {
    public static void main(String[] args) {
        Fan fan=new Fan("usha","green", 0.33);
        fan.switchOff();
        System.out.println(fan);
        fan.switchOn();
        fan.setSpeed((byte) 4);
        System.out.println(fan);
    }
    
}
