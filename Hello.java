import java.util.Scanner;

public class Hello{
  public static void main(String args[]){
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
    h.inputName();
  }

  void inputName(){
    Scanner scan = new Scanner(System.in);
    
  }

  void printTriangle(){
    out:for(int i = 0;i<10;i++){
      for(int j = 0; j<20; j++){
        if(j>i){
          System.out.println();
          continue out;
        }
        System.out.print("* ");
      }
    }
  }
}