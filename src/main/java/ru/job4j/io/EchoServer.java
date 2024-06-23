package ru.job4j.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(9000)) {
            while (!server.isClosed()) {
                Socket socket = server.accept();
                try (OutputStream output = socket.getOutputStream();
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(socket.getInputStream()))) {
                    output.write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
                    String str = in.readLine();
                    System.out.println(str);
                    String message = str.split(" ")[1];
                    if ("/?msg=Hello".equals(message)) {
                        output.write("Hello".getBytes());
                    } else if ("/?msg=Exit".equals(message)) {
                        server.close();
                    } else {
                        output.write(message.substring("/?msg=".length()).getBytes());
                    }
                }
            }
        }
    }
}