import java.util.Scanner;

public class Hello {
  public static void main(String args[]) {
    // System.out.println("Hello World!");
    // System.out.println(45&20);
    // System.out.println(1==1>>>32);
    // int b1 = 1;
    // int b2 = 1;
    // System.out.println(b1<<=31);
    // System.out.println(b2<<=31);
    // System.out.println(b1>>=31);
    // System.out.println(b1>>=1);
    // System.out.println(b2>>>=31);
    // System.out.println(b2>>>=1);
    Hello h = new Hello();
    // h.showErr();
    h.printTable();
  }

  void showErr() {
    int i = 0;
    String greetings[] = { "Hello world!", "No,I mean it!", "HELLO WORLD!!" };
    while (i < 4) {
      try {
        System.out.println(greetings[i]);
      } catch (Exception e) {
        System.out.println(e.toString());
      } finally {
        System.out.println("This is always printed");
      }
      i++;
    }
  }

  void printTriangle() {
    out: for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 20; j++) {
        if (j > i) {
          System.out.println();
          continue out;
        }
        System.out.print("* ");
      }
    }
  }

  void printTable() {
    int myTable[][] = { { 20, 45, 17, 89 }, { 23, 15, 7, 89 }, { 23, 45, 27, 89 }, { 23, 15, 67, 3 } };
    int sum, max, maxRow = Integer.MIN_VALUE;
    max = Integer.MIN_VALUE;
    for (int row = 0; row < 4; row++) {
      sum = 0;
      for (int col = 0; col < 4; col++) {
        System.out.print(myTable[row][col]);
        sum += myTable[row][col];
        if (sum > max) {
          max = sum;
          maxRow = row;
        }
      }
      System.out.println("Row " + maxRow + " has the Max sum of " + max);
    }
  }
}