import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Executor;
import java.util.Executors;


public class Thread {

    private static void startThread(Socket client, Executor executor) {

        // Setup sockets.
        var input = new DataInputStream(client.getInputStream());
        var output = new DataOutputStream(client.getOutputStream());
        
        // Submission.
        executor.submit(() -> {
            // Grab height, weight and do calculation.
            var weight = in.readShort();
            var height = input.readShort();
            var bmi = weight / (height * height);

            output.writeShort(bmi);
        });
        // Close connections 
        input.close();
        output.close();
        client.close();
    }

    public static void main(String[] args) {
        // Fake http port
        int port = 8080;
        // Server connection.
        var server = new ServerSocket(port);
        // Show me the threading
        while (true) startThread(server.accept(), Executors.newCachedThreadPool());
        // End connection.
        server.close();
    }
}