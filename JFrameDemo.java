import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameDemo {
  public static void main(String[] args) {
    JFrame frame = new JFrame("JFrameDemo");
    JButton button = new JButton("Press me");
    JPanel contentPane = new JPanel();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(button,BorderLayout.CENTER);
    frame.setContentPane(contentPane);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
