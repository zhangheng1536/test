package socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by vivider on 2016/8/25.
 */
public class GreetingServer extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingServer.class);
    private final ServerSocket serverSocket;

    public GreetingServer(final int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
        this.serverSocket.setSoTimeout(100000);
    }

    @Override public void run() {
        while (true) {
            System.out.println("Waiting for client on port " + this.serverSocket.getLocalPort() + "...");
            try {
                final Socket server = this.serverSocket.accept();
                LOGGER.debug("Just connected to " + server.getRemoteSocketAddress());
                final DataInputStream in = new DataInputStream(server.getInputStream());
                LOGGER.debug(in.readUTF());
                final DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            } catch (final IOException e) {
                LOGGER.info("ioException" + e);
                break;
            }
        }
    }

    public static void main(final String[] args) {
        final int port = Integer.parseInt("6066");
        try {
            final Thread t = new GreetingServer(port);
            t.start();
        } catch (final IOException e) {
            LOGGER.info("ioException" + e);
        }
    }
}
