import java.util.Scanner;

public class Echo {
  public static void main(String[] args) {
    String msg  ;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a line of text:");
    msg = scan.nextLine();
    System.out.println("You entered:\'"+msg+"\'");
  }
}
