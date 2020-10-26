import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Echo {
  public static void main(String[] args) {
    Echo echo = new Echo();
    echo.inputDouble();
  }
  
  void format(){
    Double myNumber = 12345.123456789;
    Double test = 1.2345;
    String myString = NumberFormat.getInstance().format(myNumber);
    System.out.println("default style:"+myNumber);
    myString = NumberFormat.getCurrencyInstance().format(myNumber);
    System.out.println("General style:"+myString);
    myString = NumberFormat.getNumberInstance().format(myNumber);
    System.out.println("General number style:"+myString);
    myString = NumberFormat.getPercentInstance().format(test);
    System.out.println("Percent style:"+myString);
    NumberFormat format = NumberFormat.getInstance();
    format.setMinimumFractionDigits(3);
    format.setMaximumFractionDigits(5);
    format.setMaximumIntegerDigits(10);
    format.setMinimumIntegerDigits(0);
    System.out.println(format.format(123456789.123456789));
  }

  void inputName(){
    String msg  ;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a line of text:");
    msg = scan.nextLine();
    System.out.println("You entered:\'"+msg+"\'");
  }

  void inputDouble(){
    int age;
    double weight,height,bmi;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input your age:");
    age = scan.nextInt();
    System.out.println("Please input your weight(kg):");
    weight = scan.nextDouble();
    System.out.println("Please input your height(m):");
    height = scan.nextDouble();
    bmi = weight/(height*height);
    DecimalFormat fmt = new DecimalFormat("0.###");
    System.out.println("BMI:"+fmt.format(bmi));
    fmt = new DecimalFormat("0.##");
    System.out.println("BMI:"+fmt.format(bmi));

  }
}
