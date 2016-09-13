import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vivider on 2016/8/25.
 */
public class IOStream {
    public static void main(final String[] args) {
        //        BRRead.read();
        BRReadLines.read();
    }
}

class BRRead {
    private static final Logger LOGGER = LoggerFactory.getLogger(BRRead.class);

    public static void read() {
        char c;
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        try {
            do {

                c = (char) br.read();

                System.out.println(c);
            } while (c != 'q');
        } catch (final IOException e) {
            LOGGER.info("IOException" + e);
        }
    }
}

class BRReadLines {
    private static final Logger LOGGER = LoggerFactory.getLogger(BRReadLines.class);

    public static void read() {
        String str;
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        try {
            do {
                str = br.readLine();
                System.out.println(str);
            } while (!str.equals("end"));
        } catch (final IOException e) {
            LOGGER.info("IOException" + e);
        }
    }
}