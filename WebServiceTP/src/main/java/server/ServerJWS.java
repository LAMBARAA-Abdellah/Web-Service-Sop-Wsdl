package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

import java.util.Scanner;

public class ServerJWS {

    public static void main(String[] args) {
        String url = "http://localhost:9191/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Server started");
        System.out.println("Server listening on port 9191");
    }
}
