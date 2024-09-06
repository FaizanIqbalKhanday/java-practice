import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class Prtc23 {
    Prtc23(){
        JFrame frame =new JFrame("new frame");
        frame.setSize(870, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab =new JLabel("faizan");
        jlab.setBackground(new java.awt.Color(53, 55, 25));
        frame.add(jlab);
        frame.setVisible(true);
    }
   public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        new Prtc23();
        }
        });

    }
   }
