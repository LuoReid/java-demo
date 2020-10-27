public class Circle {
  static double PI = 3.14159265;
  private int radius;

  public double circumference() {
    return 2 * PI * radius;
  }

  public void setRadius(int r) {
    radius = r;
  }

  public static double calcArea(int radius) {
    return PI * radius * radius;
  }

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.setRadius(50);
    Circle c2 = new Circle();
    c2.setRadius(10);
    double circum1 = c1.circumference();
    double circum2 = c2.circumference();
    System.out.println("Circle 1 has circumference " + circum1);
    System.out.println("Circle 2 has circumference " + circum2);
    System.out.println("Circle area is " + Circle.calcArea(3));
  }
}
