// inherriantance from parent to grand child.
class Animals{
    private String color;
    private String name;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
class Domestic extends Animals {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

}
class Pet extends Domestic{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    public String toString(){
        return "Name : " +getName()+" color : "+getColor()+" type :"+getType()+" age :"+age;
    }
}
public class Prtc12 {

    public static void main(String[] args) {
        Pet pet=new Pet();
        pet.setName("Puppy");
        pet.setColor("red");
        pet.setType("bull dog");
        pet.setAge(2);
        System.out.println(pet);

        
    }
    
}
