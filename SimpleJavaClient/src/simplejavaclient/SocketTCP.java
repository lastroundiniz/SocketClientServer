package simplejavaclient;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketTCP {
    
    public SocketTCP(){
    }

    public boolean ConnectTCP(String ip, int port) {
        try {
            Socket c = new Socket(ip, port);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
