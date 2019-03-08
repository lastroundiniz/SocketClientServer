package simplejavaclient;
import java.net.*;
import java.io.*;

public class SimpleJavaClient {
    public static void main(String[] args) {
        try {
            SocketTCP s = new SocketTCP(); //Cria o socket do servidor
            String ip = "192.168.1.12"; //Cria o socket do servidor
            int port = 4567;
            
            boolean statusServer;

            statusServer = s.ConnectTCP(ip, port);
            System.out.println(statusServer);
            
        } catch (Exception err) { //SocketException ou IOException
            System.err.println(err);
        }
    }        
}
   
