package com.undologic.service;

import java.net.ServerSocket;

/**
 * Created by paulsmelser on 15-06-06.
 */
public abstract class UdpListernBase implements UdpListener {

    private ServerSocket serverSocket;
    private int port;
    private String pathfProcess;
    private int maxClients;

    protected UdpListernBase(ServerSocket serverSocket,
                             int port,
                             String pathfProcess,
                             int maxClients){
        this.serverSocket = serverSocket;

        this.port = port;
        this.pathfProcess = pathfProcess;
        this.maxClients = maxClients;
    }

    @Override
    public abstract void run();

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPathfProcess() {
        return pathfProcess;
    }

    public void setPathfProcess(String pathfProcess) {
        this.pathfProcess = pathfProcess;
    }

    public int getMaxClients() {
        return maxClients;
    }

    public void setMaxClients(int maxClients) {
        this.maxClients = maxClients;
    }




}
