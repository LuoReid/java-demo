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
    // h.printTable();
    h.strTest2();
  }

  void strTest2(){
    String s1 = "This is the second string.";
    String s2 = "This is the second string.";
    String s3 = new String("This is the second string.");
    String s4 = new String(s1);
    String s5 = s1;
    boolean r1 = s1.equals(s2);
    boolean r2 = s1 == s2;
    boolean r3 = s1.equals(s3);
    boolean r4 = s1 == s3;
    boolean r5 = s1.equals(s4);
    boolean r6 = s1 == s4;
    boolean r7 = s1.equals(s5);
    boolean r8 = s1 == s5;
    System.out.println(r1+"\t"+r2+"\t"+r3+"\t"+r4+"\t"+r5+"\t"+r6+"\t"+r7+"\t"+r8);
  }

  void strTest() {
    String s = "This is a test String!";
    System.out.println("before changed, s = " + s);
    String t = s.toLowerCase();
    System.out.println("after changed, s = " + s);
    System.out.println("t = " + t);
    StringBuffer sb = new StringBuffer(s);
    System.out.println("s.length = " + s.length());
    System.out.println("sb.length = " + s.length());
    t = s.replace('a', 'o');
    System.out.println("s3.replace = " + t);
    StringBuffer sbb2 = sb.replace(2, 4, "at");
    System.out.println("sb.replace = " + sbb2);
    System.out.println("sb.capacity = " + sb.capacity());
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