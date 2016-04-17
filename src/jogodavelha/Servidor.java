package jogodavelha;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Joao
 */
public class Servidor {

    public static void main(String[] args) {
        
        ArrayList<PrintStream> clientes = new ArrayList<>();
        
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket socket;

            while (true) {
                socket = server.accept();
                //JOptionPane.showMessageDialog(null, "Conectado!");
                
                //Guarda o endereço do cliente
                clientes.add(new PrintStream(socket.getOutputStream()));
                
                Mensagem mensagem = new Mensagem(socket, clientes);
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
