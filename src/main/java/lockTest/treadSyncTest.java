package lockTest;


import java.util.concurrent.locks.ReentrantLock;

public class treadSyncTest {


  public static void main(String[] args) {
    printSyncClass printSyncClass = new printSyncClass();
    try {
      Thread thread1 = new Thread(() -> printSyncClass.printffff1());
      //thread1.setPriority(1);
      Thread.sleep(5L);
      Thread thread2 = new Thread(() -> printSyncClass.printffff2());
      //thread2.setPriority(10);
      Thread.sleep(5L);
      Thread thread3 = new Thread(() -> printSyncClass.printffff3());
      //thread3.setPriority(3);
      Thread.sleep(5L);
      Thread thread4 = new Thread(() -> printSyncClass.printffff4());
      //thread4.setPriority(4);

      thread1.start();
      Thread.sleep(1L);
      thread3.start();
      Thread.sleep(1L);
      thread2.start();
      Thread.sleep(1L);
      thread4.start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
      new Thread(() -> printSyncClass.printffff4()).start();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}

class printSyncClass {

  private ReentrantLock lock;

  public printSyncClass() {
    this.lock = new ReentrantLock();
  }

  public void printffff3() {
    System.out.println("\nstart 3");
    synchronized (this) {
      // System.out.println("\nlocksize3:" + lock.getQueueLength());
      printffff(3);
    }
  }

  public void printffff2() {
    System.out.println("\nstart 2");
    synchronized (this) {
      //System.out.println("\nlocksize2:" + lock.getQueueLength());
      printffff(2);
    }

  }

  public void printffff1() {
    System.out.println("\nstart 1");
    synchronized (this) {
      //System.out.println("\nlocksize1:" + lock.getQueueLength());
      printffff(1);
    }
  }

  private void printffff(int i) {
    for (int j = 0; j < 2; j++) {
      System.out.print((i * 10 + j) + " ");
    }
    System.out.println();
    try {
      Thread.sleep(50L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  public void printffff4() {
    System.out.println("\nstart 4");
    synchronized (this) {
      // System.out.println("\nlocksize4:" + lock.getQueueLength());
      printffff(4);
    }
  }
}