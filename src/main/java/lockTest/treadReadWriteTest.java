package lockTest;


import java.util.concurrent.locks.ReentrantReadWriteLock;

public class treadReadWriteTest {


  public static void main(String[] args) {
    printReadWriteClass printReadWriteClass = new printReadWriteClass();
    try {
      Thread thread1 = new Thread(() -> {
        //printReadWriteClass.resetLock.readLock().lock();
        printReadWriteClass.printffff1();
        //printReadWriteClass.resetLock.readLock().unlock();
      });
      //thread1.setPriority(1);
      Thread.sleep(5L);
      Thread thread2 = new Thread(() -> {
        //printReadWriteClass.resetLock.writeLock().lock();
        printReadWriteClass.printffff2();
        // printReadWriteClass.resetLock.writeLock().unlock();
      });
      //thread2.setPriority(10);
      Thread.sleep(5L);
      Thread thread3 = new Thread(() -> {
        // printReadWriteClass.resetLock.readLock().lock();
        printReadWriteClass.printffff3();
        //  printReadWriteClass.resetLock.readLock().unlock();
      });
      //thread3.setPriority(3);
      Thread.sleep(5L);
      Thread thread4 = new Thread(() -> {
        // printReadWriteClass.resetLock.readLock().lock();
        printReadWriteClass.printffff4();
        // printReadWriteClass.resetLock.readLock().unlock();
      });
      //thread4.setPriority(4);

      thread1.start();
      Thread.sleep(1L);
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      new Thread(() ->
          printReadWriteClass.printffff4()).start();
      thread2.start();
      Thread.sleep(1L);
      thread3.start();
      Thread.sleep(1L);
      thread4.start();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}

class printReadWriteClass {

  public ReentrantReadWriteLock resetLock = new ReentrantReadWriteLock();

  public void printffff3() {
    System.out.println("\nstart 3");
    resetLock.readLock().lock();
    System.out.println("\nlocksize3:" + resetLock.getQueueLength());
    synchronized (this) {
      printffff(3);
    }
    resetLock.readLock().unlock();
  }

  public void printffff2() {
    System.out.println("\nstart 2");
    resetLock.writeLock().lock();
    System.out.println("\nlocksize2:" + resetLock.getQueueLength());
    synchronized (this) {
      printffff(2);
    }
    resetLock.writeLock().unlock();

  }

  public void printffff1() {
    System.out.println("\nstart 1");
    resetLock.readLock().lock();
    System.out.println("\nlocksize1:" + resetLock.getQueueLength());
    synchronized (this) {
      printffff(1);
    }
    resetLock.readLock().unlock();
  }

  private void printffff(int i) {
    for (int j = 0; j < 2; j++) {
      System.out.print((i * 10 + j) + " ");
    }
    System.out.println();
    try {
      Thread.sleep(500L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  public void printffff4() {
    System.out.println("\nstart 4");
    resetLock.readLock().lock();
    System.out.println("\nlocksize4:" + resetLock.getQueueLength());
    synchronized (this) {
      printffff(4);
    }
    resetLock.readLock().unlock();
  }
}