import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;

public class Synchronously {

    public static void main(String[] args) {
        // Pretend http conection
        int port = 8080;

        // Create the server socket.
        var server = new ServerSocket(port);
        var client = server.accept();

        // Create the in and out connection.    
        var in = new DataInputStream(client.getInputStream());
        var out = new DataOutputStream(client.getOutputStream());
        
        // Grab height, weight and do calculation.
        var weight = in.readShort();
        var height = in.readShort();
        var bmi = weight / (height * height);

        out.writeShort(bmi);

        // Close connection.
        in.close();
        out.close();
        client.close();
        server.close();
    }
}
