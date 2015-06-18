package com.undologic.service;

import java.net.ServerSocket;

public class CalAmpUdpListenerBuilder {
    private ServerSocket serverSocket;
    private int port;
    private String pathfProcess;
    private int maxClients;

    public static CalAmpUdpListenerBuilder initalize(){
        return new CalAmpUdpListenerBuilder();
    }
    public CalAmpUdpListenerBuilder setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
        return this;
    }

    public CalAmpUdpListenerBuilder setPort(int port) {
        this.port = port;
        return this;
    }

    public CalAmpUdpListenerBuilder setPathfProcess(String pathfProcess) {
        this.pathfProcess = pathfProcess;
        return this;
    }

    public CalAmpUdpListenerBuilder setMaxClients(int maxClients) {
        this.maxClients = maxClients;
        return this;
    }

    public CalAmpUdpListener build() {
        return new CalAmpUdpListener(serverSocket, port, pathfProcess, maxClients);
    }
}