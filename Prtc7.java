// prime no
import java.util.Scanner;
public class Prtc7 {

    public static void main(String args[]) {
        int n,count=0;
        Scanner st=new Scanner(System.in);
        n=st.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        st.close();
        if(count==2){
            System.out.println("prime");
            }
        else{
                System.out.println("not prime");
            }
 
    }   
    }
