// synchronization threading


public class Prtc20 implements Runnable{
    int available=1,passenger;
    Prtc20(int passenger){
        this.passenger=passenger;
    }
    public synchronized void run(){
        String name= Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+" reserve the seet");
            available=available-passenger;
        }
        else{
            System.out.println("sorry seat is not available");
        }
    }

}
    class Bus {
    public static void main(String[] args) {
        Prtc20 r=new Prtc20(1);
        Thread t1 =new Thread(r);
        Thread t2 =new Thread(r);
        Thread t3 =new Thread(r);

        t1.setName("faizan");
        t2.setName("imran");
        t3.setName("kousar");
        t1.start();
        t2.start();
        t3.start();
    }
    
}
