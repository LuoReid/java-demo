import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JTextAreaDemo {
  JFrame frame = new JFrame("JTextArea Demo");
  JTextArea ta1, ta2;
  JButton copy, clear;

  public static void main(String[] args) {
    JTextAreaDemo tad = new JTextAreaDemo();
    tad.go();
  }

  public void go() {
    ta1 = new JTextArea(3, 15);
    ta1.setSelectedTextColor(Color.red);
    ta2 = new JTextArea(7, 20);
    ta2.setEditable(false);
    JScrollPane jsp1 = new JScrollPane(ta1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    JScrollPane jsp2 = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    copy = new JButton("Copy");
    copy.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(ta1.getSelectedText() != null)
          ta2.append(ta1.getSelectedText()+"\n");
        else
          ta2.append("\n "+ta1.getText()+"\n");
      }
    });
    clear = new JButton("Clear");
    clear.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        ta2.setText("");
      }
    });
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    Border etchedBase = BorderFactory.createEtchedBorder();
    Border etched1 = BorderFactory.createTitledBorder(etchedBase,"输入区");
    Border etched2 = BorderFactory.createTitledBorder(etchedBase,"复制区");
    p1.setBorder(etched1);
    p2.setBorder(etched2);
    p1.add(jsp1);
    p1.add(copy);
    p2.add(jsp2);
    p2.add(clear);
    Container cp = frame.getContentPane();
    cp.add(p1,BorderLayout.CENTER);
    cp.add(p2,BorderLayout.SOUTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
