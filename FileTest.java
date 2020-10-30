import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileTest {
  public static void main(String[] args) {
    FileTest f = new FileTest();
    // f.write();
    // f.read();
    f.writeObj();
    f.readObj();
  }

  public void readObj() {
    java.util.Date d = null;
    try {
      FileInputStream f = new FileInputStream("date.ser");
      ObjectInputStream s = new ObjectInputStream(f);
      d = (java.util.Date) s.readObject();
      s.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Date serialized at " + d);
  }

  public void writeObj() {
    try {
      java.util.Date d = new java.util.Date();
      FileOutputStream f = new FileOutputStream("date.ser");
      ObjectOutputStream s = new ObjectOutputStream(f);
      s.writeObject(d);
      s.close();
      System.out.println("Date serialized at " + d);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void read() {
    try {
      FileInputStream in = new FileInputStream("myFile.dat");
      while (in.available() > 0) {
        System.out.print(in.read() + ",");
      }
      in.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error: Cannot open file for reading.");
    } catch (EOFException e) {
      System.out.println("Error: EOF encountered, file may be corrupted.");
    } catch (IOException e) {
      System.out.println("Error: Cannot read from file.");
    }
  }

  public void write() {
    try {
      FileOutputStream out = new FileOutputStream("myFile.dat");
      out.write('H');
      out.write(69);
      out.write(76);
      out.write('L');
      out.write('O');
      out.write('!');
      out.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error: Cannot open file for writing.");
    } catch (IOException e) {
      System.out.println("Error: Cannot write to file.");
    }
  }
}
