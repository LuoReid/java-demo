class Lefthand extends Thread {
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println("I am Lefthand!");
      try {
        sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
        // TODO: handle exception
      }
    }
  }
}

class Righthand extends Thread {
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println("I am Righthand!");
      try {
        sleep(300);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class TwoThread implements Runnable {
  private int i;

  public void run() {
    for (; i < 20; i++) {
      System.out.println(Thread.currentThread().getName() + "\t " + i);
      if (i == 20) {
        System.out.println(Thread.currentThread().getName() + "\t over");
      }
    }
  }
}

public class ThreadTest {
  static Lefthand left;
  static Righthand right;

  public static void main(String[] args) {
    left = new Lefthand();
    right = new Righthand();
    // left.start();
    // right.start();
    ThreadTest test = new ThreadTest();
    test.go();
  }

  public void go() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + "\t " + i);
      if (i == 5) {
        TwoThread t1 = new TwoThread();
        Thread thread1 = new Thread(t1, "thread 1");
        Thread thread2 = new Thread(t1, "thread 2");
        thread1.start();
        thread2.start();
      }
    }
  }
}
