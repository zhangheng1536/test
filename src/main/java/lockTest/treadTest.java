package lockTest;


import java.util.concurrent.locks.ReentrantLock;

public class treadTest {


  public static void main(String[] args) {
    printClass printClass = new printClass();
    try {
      new Thread(() -> printClass.printffff1()).start();
      Thread.sleep(5L);
      new Thread(() -> printClass.printffff2()).start();
      Thread.sleep(5L);
      new Thread(() -> printClass.printffff3()).start();
      Thread.sleep(5L);
      new Thread(() -> printClass.printffff4()).start();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class printClass {

  private ReentrantLock lock;

  public printClass() {
    this.lock = new ReentrantLock();
  }

  public void printffff3() {
    System.out.println("\nstart 3");
    System.out.println("\nlocksize3:" + lock.getQueueLength());
    try {
      lock.lock();
      //while (!lock.tryLock()) {
      //}
      //System.out.println("\nlocksize31:" + lock.getQueueLength());
      printffff(3);
    } finally {
      lock.unlock();
    }
  }

  public void printffff2() {
    System.out.println("\nstart 2");
    System.out.println("\nlocksize2:" + lock.getQueueLength());
    try {
      //lock.lock();
      while (!lock.tryLock()) {
        // Thread.sleep(1L);
      }
      //System.out.println("\nlocksize21:" + lock.getQueueLength());
      printffff(2);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public void printffff1() {
    System.out.println("\nstart 1");
    System.out.println("\nlocksize1:" + lock.getQueueLength());
    try {
      lock.lock();
      //System.out.println("\nlocksize11:" + lock.getQueueLength());
      printffff(1);


    } finally {
      lock.unlock();
    }
  }

  private void printffff(int i) {
    for (int j = 0; j < 20; j++) {
      System.out.print((i * 10000 + j) + " ");
    }
    System.out.println();
    try {
      Thread.sleep(150L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void printffff4() {
    System.out.println("\nstart 4");
    System.out.println("\nlocksize4:" + lock.getQueueLength());
    try {
      // lock.lock();
      while (!lock.tryLock()) {
      }
      //System.out.println("\nlocksize31:" + lock.getQueueLength());
      printffff(4);
    } finally {
      lock.unlock();
    }
  }
}