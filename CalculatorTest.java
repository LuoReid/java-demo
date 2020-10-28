class Calculator {
  public static double calculateAverage(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum / (double) numbers.length;
  }

  public static int findMaximum(int[] numbers) {
    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }
}

public class CalculatorTest {
  public static void main(String[] args) {
    int numbers[] = { 23, 54, 88, 98, 23, 54, 7, 72, 35, 22 };
    System.out.println("The average is " + Calculator.calculateAverage(numbers));
    System.out.println("The maximum is " + Calculator.findMaximum(numbers));
  }
}
