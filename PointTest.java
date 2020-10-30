class Point {
  public int x, y;

  Point(int x1, int y1) {
    x = x1;
    y = y1;
  }

  Point() {
    this(0, 0);
  }

  public void moveTo(int x1, int y1) {
    x = x1;
    y = y1;
  }
  
}

public class PointTest {
  public static void main(String[] args) {
    Point p = new Point(1, 1);
    p.x = p.y = 20;
    System.out.println("p.x = " + p.x + " p.y = " + p.y);
    p.moveTo(30, 30);
    System.out.println("p.x = " + p.x + " p.y = " + p.y);
    // Object[] points = new Point[2];
    // Point[] p2 = new Object[2];
  }
}
