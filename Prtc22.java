import java.util.Stack;

public class Prtc22 {
    public static void main(String[] args) {
        Stack<Integer> number =new Stack<>();
        number.push(3);
        number.push(4);
        number.push(5);
        System.out.println(number);
        number.pop();
        System.out.println(number);
    }
}
