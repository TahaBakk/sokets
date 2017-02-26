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


        for (int i = 5550; i < 64512; i++) {

            try {
                Socket cliente = new Socket();
                InetSocketAddress addr = new InetSocketAddress("localhost", 5550);
                cliente.connect(addr);
                InputStream is = cliente.getInputStream();
                OutputStream os = cliente.getOutputStream();
                String mensaje = "hehe me salio xDD";
                os.write(mensaje.getBytes());
                cliente.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
