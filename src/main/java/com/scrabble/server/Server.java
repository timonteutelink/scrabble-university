package com.scrabble.server;

import com.scrabble.Constants;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server implements Runnable {

    private ServerSocket serverSocket;
    private List<Player> players;

    public Server() {
        try {
            serverSocket = new ServerSocket(Constants.PORT);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        players = new ArrayList<>();
    }

    public void start() {
        for (int i = 0; i <= 1; i++) {
            Socket playerSocket = welcomeSocket.accept();
            players.add(playerSocket);
        }

    }


    @Override
    public void run() {
        while(true) {
            try {
                Socket newConnection = serverSocket.accept();

                players.add(new Player(newConnection));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
