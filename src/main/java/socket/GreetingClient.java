package socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.Socket;

/**
 * Created by vivider on 2016/8/25.
 */
public class GreetingClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingClient.class);

    public static void main(final String[] args) {
        final String serverName = "localhost";
        final int port = Integer.parseInt("6066");
        LOGGER.debug("Connecting to " + serverName + " on port " + port);
        try {
            final Socket client = new Socket(serverName, port);
            LOGGER.debug("Just connected to " + client.getRemoteSocketAddress());
            final OutputStream outToServer = client.getOutputStream();
            final DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("hello from " + client.getLocalSocketAddress());
            final InputStream inFromServer = client.getInputStream();
            final DataInputStream in = new DataInputStream(inFromServer);
            LOGGER.debug("Server says " + in.readUTF());
            client.close();
        } catch (final IOException e) {
            LOGGER.info("ioException" + e);
        }
    }
}
