import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by vivider on 2016/8/25.
 */
public class FileStream {
    public static void main(final String[] args) {
        FileStreamTest2.test();
    }
}

class FileStreamTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileStreamTest.class);

    public static void test() {
        final byte[] bWrite = { 11, 21, 3, 40, 5 };
        try {
            final OutputStream os = new FileOutputStream("src/main/resources/test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            final InputStream is = new FileInputStream("src/main/resources/test.txt");
            final int size = is.available();

            for (int i = 0; i < size; i++) {
                LOGGER.debug((char) is.read() + "  ");
            }
            is.close();
        } catch (final IOException e) {
            LOGGER.info("ioException  " + e);
        }
    }
}

class FileStreamTest2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileStreamTest.class);

    public static void test() {
        final File file = new File("src/main/resources/hello.txt");
        try {
            final FileOutputStream fop = new FileOutputStream(file);
            final OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
            writer.append("中文输入");
            writer.append("\r\n");
            writer.append("Englisg");
            writer.close();
            fop.close();
            final FileInputStream fip = new FileInputStream(file);
            final InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
            final StringBuffer sb = new StringBuffer();
            while (reader.ready()) {
                sb.append((char) reader.read());
            }
            System.out.println(sb.toString());
            reader.close();
            fip.close();
        } catch (final IOException e) {
            LOGGER.info("ioException" + e);
        }
    }
}