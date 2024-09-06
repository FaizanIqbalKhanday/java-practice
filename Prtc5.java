// daily practice problem
class Echo{
    int count=0;
    void faizan(){
        System.out.println("Faizan");
    }
}
public class Prtc5 {
   public static void main(String[] args) {
       Echo e1=new Echo();
       Echo e2=new Echo();
       int x=0;
       while(x<4){
           e1.faizan();
           e1.count=e1.count+1;
           if(x==3){
               e2.count=e2.count+1;
            }
            if(x==2){
                e2.count=e2.count+e1.count;
            }
         x=x+1;  
       }
       System.out.println(e2.count);

}
}
