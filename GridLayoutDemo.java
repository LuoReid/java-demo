import java.awt.*;
import javax.swing.*;

class MyWindow extends JFrame{
  private JButton b1,b2,b3,b4,b5,b6;
  MyWindow(){
    setTitle("Grid example");
    Container contentPane = getContentPane();
    contentPane.setPreferredSize(new Dimension(400,350));
    contentPane.setLayout(new GridLayout(3,2));
    b1 = new JButton("grid_1");
    b2 = new JButton("grid_2");
    b3 = new JButton("grid_3");
    b4 = new JButton("grid_4");
    b5 = new JButton("grid_5");
    b6 = new JButton("grid_6");
    contentPane.add(b1);
    contentPane.add(b2);
    contentPane.add(b3);
    contentPane.add(b4);
    contentPane.add(b5);
    contentPane.add(b6);
    pack();
    setVisible(true);
  }
}

public class GridLayoutDemo {
  public static void main(String[] args) {
    MyWindow that = new MyWindow();
    that.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
