import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 53638138e on 01/02/17.
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            System.out.println("generando el servidor");

            ServerSocket serverSocket = new ServerSocket();
            System.out.println("Realizando el vinculo");
            InetSocketAddress addr = new InetSocketAddress("0000",5555);
            serverSocket.bind(addr);

            System.out.println("Aceptando conexiones");
            Socket newSocket = serverSocket.accept();
            System.out.println("Conexión recivida");
            InputStream io = newSocket.getInputStream();
            OutputStream os = newSocket.getOutputStream();

            byte [] mensaje= new byte[50];
            io.read(mensaje);

            System.out.println("Mensaje recivido : "+new String(mensaje));
            System.out.println("Cerrando el socket");
            newSocket.close();
            System.out.println("Cerrando el socket servidor");
            serverSocket.close();


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
