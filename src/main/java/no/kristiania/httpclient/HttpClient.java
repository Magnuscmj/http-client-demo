package no.kristiania.httpclient;

import java.io.IOException;
import java.net.Socket;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("urlecho.appspot.com", 80);
        String requestTarget = "/echo?status=200&body=Kristiania";
        socket.getOutputStream().write(requestTarget.getBytes());

    }
}
