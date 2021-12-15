import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class Client {
    
    Socket socket;
    DataInputStream in;
    DataOutputStream out;

    public Client() {}

    public void connect(String ip, int port) {
        // Connect to client.
        socket = new Socket(ip, port);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream());
    }

    public void disconnect() {
        // Disconnect to from.
        in.close();
        out.close();
        socket.close();
    }

    public short getBMI(short weight, short height) {
        // Give attributes.
        out.writeShort(weight);
        out.writeShort(height);
        return in.readShort();
    }
}