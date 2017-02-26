import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Taha on 26/02/2017.
 */
public class HiloPeticion extends Thread{

    private Socket socket;

    public HiloPeticion() {
    }

    public HiloPeticion(Socket socket) {this.socket = socket;}

    @Override
    public void run() {
        InputStream is = null;
        try {
            is = socket.getInputStream();

            OutputStream os = socket.getOutputStream();

            byte[] mensaje = new byte[50];
            is.read(mensaje);

            System.out.println("Mensaje recibido : "+ new String (mensaje));
            System.out.println("Cerrando el socket");

            socket.close();

            System.out.println("Cerrando el socket servidor");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
