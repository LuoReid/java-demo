class Point1 {
  void print() {
    System.out.println("This is the superclass!");
  }

}

public class Point3d extends Point1 {
  void print() {
    super.print();
    System.out.println("This is the subclass!");
  }

  public static void main(String[] args) {
    Point1 superp = new Point1();
    superp.print();
    Point3d subp = new Point3d();
    subp.print();
  }
}
