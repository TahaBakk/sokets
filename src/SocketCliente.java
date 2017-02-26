import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by 53638138e on 01/02/17.
 */
public class SocketCliente {

    public static void main(String[] args) {


        for (int i = 0; i < 64512; i++) {

            try {
                Socket cliente = new Socket();
                InetSocketAddress addres = new InetSocketAddress("192.168.1.142", i);
                cliente.connect(addres);
                InputStream is = cliente.getInputStream();
                OutputStream os = cliente.getOutputStream();
                String mensaje = "Mi primer mensaje que navega";
                os.write(mensaje.getBytes());
                System.out.println("El puerto " + i + " esta abierto");
                cliente.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
