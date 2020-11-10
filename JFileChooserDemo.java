import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class JFileChooserDemo implements ActionListener {
  JFrame frame = new JFrame("JFileChooser Demo");
  JFileChooser fc = new JFileChooser();
  JTextField tf = new JTextField();
  JButton open, save, delete;

  public static void main(String[] args) {
    JFileChooserDemo fcd = new JFileChooserDemo();
    fcd.go();
  }

  public void go() {
    ImageIcon openIcon = new ImageIcon("open.gif");
    open = new JButton("Open a File...", openIcon);
    open.addActionListener(this);
    ImageIcon saveIcon = new ImageIcon("save.gif");
    save = new JButton("Save a File...", saveIcon);
    save.addActionListener(this);
    ImageIcon deleteIcon = new ImageIcon("delete.gif");
    delete = new JButton("Delete a File...", deleteIcon);
    delete.addActionListener(this);
    JPanel p1 = new JPanel();
    p1.add(open);
    p1.add(save);
    p1.add(delete);
    Container cp = frame.getContentPane();
    cp.add(p1, BorderLayout.CENTER);
    cp.add(tf, BorderLayout.SOUTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    if (button == open) {
      int select = fc.showOpenDialog(frame);
      if (select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Opening: " + file.getName());
      } else {
        tf.setText("Open command cancelled by user");
      }
    }
    if (button == save) {
      int select = fc.showSaveDialog(frame);
      if (select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Saving: " + file.getName());
      } else {
        tf.setText("Save command cancelled by user");
      }
    }
    if (button == delete) {
      int select = fc.showDialog(frame, "Delete");
      if (select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Deleting: " + file.getName());
      } else {
        tf.setText("Delet command cancelled by user");
      }
    }
  }
}
