import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JListDemo {
  JFrame frame = new JFrame("JList Demo");
  JList list;
  DefaultListModel listModel;
  JPanel panel;
  JTextField tf;
  JButton button;

  public static void main(String[] args) {
    JListDemo ld = new JListDemo();
    ld.go();
  }

  public void go() {
    listModel = new DefaultListModel();
    listModel.addElement("one");
    listModel.addElement("two");
    listModel.addElement("three");
    listModel.addElement("four");
    list = new JList(listModel);
    JScrollPane jsp = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    Container cp = frame.getContentPane();
    cp.add(jsp);
    tf = new JTextField(15);
    button = new JButton("add new item");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        listModel.addElement(tf.getText());
      }
    });
    panel = new JPanel();
    panel.add(tf);
    panel.add(button);
    cp.add(panel, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
