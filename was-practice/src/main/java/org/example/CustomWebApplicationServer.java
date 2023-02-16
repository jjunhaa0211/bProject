package org.example;

import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class CustomWebApplicationServer {
    
    private final int port;

    private static final Logger logger = (Logger) LoggerFactory.getLogger(CustomWebApplicationServer.class);
    
    public CustomWebApplicationServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(port)) {
            logger.info("[CustomWebApplicationServer] started {} port.");

            boolean clientSocket;
            logger.info("[CustomWebApplicationServer] waiting for client.");

            while (clientSocket = serverSocket.accept() != null) {
                logger.info("[CustomWebApplicationServer] client connected!");
            }
        }
    }
}
