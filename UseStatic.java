
class Count{
  private int serialNumber;
  static int counter = 0;
  public Count(){
    counter++;
    serialNumber = counter;
  }
  public int getSerialNumber(){
    return serialNumber;
  }
}
public class UseStatic{
  public static void main(String[] args) {
    System.out.println("Count.counter is "+Count.counter);
    Count tom = new Count();
    Count john = new Count();
    System.out.println("Tom's serialNumber is "+tom.getSerialNumber());
    System.out.println("John's serialNumber is "+john.getSerialNumber());
    System.out.println("Now Count.counter is "+Count.counter);
  }
}