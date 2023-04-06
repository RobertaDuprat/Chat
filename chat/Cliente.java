import java.io.*;
import java.net.Socket;
import javax.swing.JOptionPane;


public class Cliente{
    public static void main(String args[])throws IOException{ 
    System.out.println("Cliente iniciado...");
    Socket socket = new Socket("localhost", 5000);
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    EscutaThread escuta = new EscutaThread(in);
    escuta.start();
    String entrada = "";
    while(true){
        entrada=JOptionPane.showInputDialog(null, "Mensagem para o servidor", "cliente");
        out.print(entrada);
        System.out.println("cliente" + entrada);
    }
    }
}