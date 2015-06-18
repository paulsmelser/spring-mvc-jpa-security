package com.undologic.service;

import java.net.ServerSocket;

/**
 * Created by paulsmelser on 15-06-06.
 */
public class CalAmpUdpListener extends UdpListernBase {

    protected CalAmpUdpListener(ServerSocket serverSocket, int port, String pathfProcess, int maxClients) {
        super(serverSocket, port, pathfProcess, maxClients);
    }

    @Override
    public void run() {

    }
}
