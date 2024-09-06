// multi threading

import java.util.Scanner;

public class Prtc19 extends Thread {
    public void run(){
        int n1=0,n2=1,sum=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<=a;i++){
            System.out.print("b1: "+sum+" ");
            n1=n2;
            n2=sum;
            sum=n1+n2;
        }
        sc.close();
      
    }
    
}
class B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Prtc19 obj= new Prtc19();
        obj.start();
        int n1=0,n2=1,sum=0;
        for(int i=1;i<=a;i++){
            System.out.print("a1: "+sum+" ");
            n1=n2;
            n2=sum;
            sum=n1+n2;
        }
        sc.close();
    }
        
    }

