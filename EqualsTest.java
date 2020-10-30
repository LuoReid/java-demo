class BankAccount {
  private String ownerName;
  private int accountNumber;
  private float balance;

  BankAccount(String name, int num1, float num2) {
    ownerName = name;
    accountNumber = num1;
    balance = num2;
  }

  String getOwnerName() {
    return ownerName;
  }

  int getAccountNumber() {
    return accountNumber;
  }

  float getBalance() {
    return balance;
  }

  public boolean equals(Object x){
    if(this.getClass()!=x.getClass())
      return false;
    BankAccount b = (BankAccount)x;
    return (this.getOwnerName().equals(b.getOwnerName())
    && this.getAccountNumber() == b.getAccountNumber() 
    && this.getBalance() == b.getBalance());
  }
}

public class EqualsTest {
  public static void main(String[] args) {
    BankAccount a = new BankAccount("Bob", 123456, 100.00f);
    BankAccount b = new BankAccount("Bob", 123456, 100.00f);
    if (a.equals(b)) {
      System.out.println("equals_YES");
    } else {
      System.out.println("equals_NO");
    }
    if (a == b) {
      System.out.println("==_YES");
    } else {
      System.out.println("==_NO");
    }
  }
}
