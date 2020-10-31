
import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo {
  private JFrame frame;
  private JButton button1,button2,button3;
  public static void main(String[] args) {
    FlowLayoutDemo that = new FlowLayoutDemo();
    that.go();
  }
  public void go(){
    frame = new JFrame("Flow Layout");
    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new FlowLayout());
    button1 = new JButton("OK");
    button2 = new JButton("Open");
    button3 = new JButton("Close");
    contentPane.add(button1);
    contentPane.add(button2);
    contentPane.add(button3);
    frame.setSize(200,100);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
