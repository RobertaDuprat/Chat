import java.io.*;
import javax.swing.*;
import java.net.*;


public class Servidor {
    public static void main(String args[]) throws IOException{
        System.out.println("Servidor Iniciado...");
        ServerSocket socketServidor = new ServerSocket(5000);
        Socket socketClient = socketServidor.accept();
        PrintWriter out = new PrintWriter(socketClient.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
        EscutaThread escuta = new EscutaThread(in);
        escuta.start();
        String entrada;
        while(true){
            entrada=JOptionPane.showInputDialog(null, "mensagem para o cliente ", "servidor");
            System.out.println("servidor"+ entrada);
            out.println(entrada);
        }
    }
}
