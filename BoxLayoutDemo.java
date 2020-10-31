import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo {
  private JFrame frame;
  private JPanel pv,ph;
  public static void main(String[] args) {
    BoxLayoutDemo that = new BoxLayoutDemo();
    that.go();
  }
  void go(){
    frame = new JFrame("Box Layout example");
    Container contentPane = frame.getContentPane();
    pv = new JPanel();
    pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
    pv.add(new JLabel(" First"));
    pv.add(new JLabel(" Second"));
    pv.add(new JLabel(" Third"));
    contentPane.add(pv, BorderLayout.CENTER);

    ph = new JPanel();
    ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
    ph.add(new JButton("YES"));
    ph.add(new JButton("No"));
    ph.add(new JButton("Cancel"));
    contentPane.add(ph, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
  }
}
