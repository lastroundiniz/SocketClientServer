package simplejavaserver;

import java.net.*;
import java.io.*;
public class SimpleJavaServer {
    public static void main(String[] args) {
        try {
        ServerSocket ss = new ServerSocket(4567); //Cria o socket do servidor, porta 4567
        String str;
            while(true) {
                Socket s = ss.accept(); //Fica bloqueado esperando uma solicitação de conexão
                InputStream i = s.getInputStream();//Pega o stream de entrada do socket
                OutputStream o = s.getOutputStream();//Pega o stream de saída do socket
                do {
                    byte[] line = new byte[100];
                    i.read(line); //le a solicitacao do cliente
                    o.write(line); //devolve a mesma mensagem para o cliente
                    str = new String(line);
                } while ( !str.trim().equals("bye") ); //Enquanto a a msg for diferente de bye
                s.close();
            }
        } catch (Exception err) { //SocketException ou IOException
            System.err.println(err);
        }
    }
}