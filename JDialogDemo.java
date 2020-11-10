import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDialogDemo implements ActionListener {
  JFrame frame;
  JDialog dialog;
  JButton button;

  public static void main(String[] args) {
    JDialogDemo jd = new JDialogDemo();
    jd.go();
  }

  public void go() {
    frame = new JFrame("JDialog Demo");
    dialog = new JDialog(frame, "Dialog", true);
    dialog.getContentPane().add(new JLabel("Hello, I'm a Dialog"));
    dialog.setSize(100, 80);
    button = new JButton("Show Dialog");
    button.addActionListener(this);
    Container cp = frame.getContentPane();
    cp.add(button, BorderLayout.SOUTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 150);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    dialog.setVisible(true);
  }
}
