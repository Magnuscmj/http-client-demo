package no.kristiania.httpclient;

import java.io.IOException;
import java.net.Socket;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("urlecho.appspot.com", 80);
        String request = "";
        socket.getOutputStream().write(request.getBytes());
    }
}
