import java.awt.*;
import javax.swing.*;

public class NullLayoutDemo {
  private JFrame frame;
  private JButton b1,b2,b3;
  public static void main(String[] args) {
    NullLayoutDemo that = new NullLayoutDemo();
    that.go();
  }
  void go(){
    frame = new JFrame("Null Layout example");
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(null);
    b1 = new JButton("Yes");
    contentPane.add(b1);
    b2 = new JButton("No");
    contentPane.add(b2);
    b3 = new JButton("Cancel");
    contentPane.add(b3);
    b1.setBounds(30,15,75,20);
    b2.setBounds(60,60,75,50);
    b3.setBounds(160,20,75,30);
    frame.setSize(300,200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
