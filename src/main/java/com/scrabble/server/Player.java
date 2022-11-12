package com.scrabble.server;

import java.net.Socket;

public class Player implements Runnable {

    private Socket socket;

    public Player(Socket socket) {
        this.socket = socket;
    }

    public void run() {
    }
}
