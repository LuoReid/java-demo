import java.util.Vector;

abstract class Person {
  private String name = "John";

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }

  int basic = 2000;

  abstract void salary();
}

class Employee extends Person {
  private int employeeNumber;

  public int getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(int v) {
    employeeNumber = v;
  }

  void salary() {
    System.out.println("Salary equals " + basic * 3);
  }
}

class Worker extends Employee {
  void salary() {
    System.out.println("薪资等于" + basic * 2);
  }
}

class Manager extends Employee {
  public String department;
  public Vector<String> responsibilities;

  public Vector<String> getResponisbilities() {
    return responsibilities;
  }

  void salary() {
    System.out.println("Salary equals " + basic * 5);
  }
}

public class PersonTest {
  public static void main(String[] args) {
    // method3
    Employee jim = new Manager();
    jim.setName("Jim");
    Manager unknown = (Manager) jim;
    unknown.setEmployeeNumber(543469);
    unknown.responsibilities = new Vector<String>();
    unknown.responsibilities.add("Internet project");
    unknown.responsibilities.add("Internet project1");
    System.out.println(jim.getName());
    System.out.println(jim.getEmployeeNumber());
    System.out.println(unknown.getName());
    System.out.println(unknown.getEmployeeNumber());
    System.out.println(unknown.getResponisbilities());
    // Employee jim = new Employee();
    // jim.name = "Jim";
    // jim.employeeNumber = 123456;
    // System.out.println(jim.getName());
    // Manager betty = new Manager();
    // betty.name = "Betty";
    // betty.employeeNumber = 543469;
    // betty.responsibilities = new Vector<String>();
    // betty.responsibilities.add("Internet project");
    // System.out.println(betty.getName());
    // System.out.println(betty.getEmployeeNumber());

    // method2
    // Employee betty = new Manager();
    // betty.name = "Betty";
    // System.out.println(betty.getName());
    // betty.employeeNumber = 543469;
    // betty.salary();
    // if (betty instanceof Manager) {
    // Manager m = (Manager) betty;
    // m.department = "Test";
    // System.out.println("This is the manager of " + m.department);
    // m.salary();
    // }
  }
}
