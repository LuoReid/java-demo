interface Shape2D {
  final double pi = 3.14;

  public abstract double area();
}

class Circle implements Shape2D {
  double radius;

  public Circle(double r) {
    radius = r;
  }

  public double area() {
    return (pi * radius * radius);
  }
}

class Rectangle implements Shape2D {
  int width, height;

  public Rectangle(int w, int h) {
    width = w;
    height = h;
  }

  public double area() {
    return (width * height);
  }
}

public class InterfaceTest {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(5, 6);
    System.out.println("Area of rect = " + rect.area());
    Circle cir = new Circle(2.0);
    System.out.println("Area of cir = " + cir.area());
  }
}
