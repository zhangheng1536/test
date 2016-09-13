import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by vivider on 2016/8/25.
 */
public class MyThread {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyThread.class);

    public static void main(final String[] args) {
        //        new NewThread(1);
        //        new NewThread(2);
        //        new NewThread(3);
        new NewThreads(1);
        new NewThreads(2);
        new NewThreads(3);
        for (int i = 5; i > 0; i--) {
            LOGGER.info("Main Thread:" + i + "-------------" + 0);
            try {
                Thread.sleep(100);
            } catch (final InterruptedException e) {
                LOGGER.info("Main thread interrupted.");
            }
        }
        LOGGER.info("Main thread exiting.");
    }
}

class NewThread implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewThread.class);
    Thread t;
    private final int n;

    NewThread(final int n) {
        this.t = new Thread(this, "Demo Thread" + n);
        LOGGER.info("Child thread:" + this.t);
        this.n = n;
        this.t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                LOGGER.info("Child Thread: " + i + "-------------" + this.n);
                Thread.sleep(50);
            }
        } catch (final InterruptedException e) {
            LOGGER.info("Exiting child thread.");
        }
    }
}

class NewThreads extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewThreads.class);
    private final int n;

    NewThreads(final int n) {
        super("Demo Thread" + n);
        this.n = n;
        LOGGER.info("Child threads:" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                LOGGER.info("Child threads:" + i + "-------------" + this.n);
                super.sleep(50);
            }
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }
}
