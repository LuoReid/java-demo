public class Date {
  private int day, month, year;

  public void printDate() {
    System.out.println("The current date is(dd/mm/yy):" + this.day + "/" + this.month + "/" + this.year);
  }

  public static void main(String[] args) {
    Date d = new Date();
    d.printDate();
  }
}
