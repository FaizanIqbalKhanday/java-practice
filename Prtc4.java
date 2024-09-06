// calculate area
class Faizan{
    private int width;
    private int length;
    void setArea(int width,int length){
    this.width=width;
    this.length=length;
    }
    int getArea(){
        return length*width;
    }
}
class Prtc4{
   
    public static void main(String[] args) {
        Faizan area=new Faizan();
        area.setArea(5, 6);
        System.out.println("Area of rectangle is = "+area.getArea());
    }
}