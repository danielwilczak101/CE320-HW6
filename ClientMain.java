public class ClientMain {
    public static void main(String[] args) {

        
        Client client_1 = Client();
        Client client_2 = Client();
        Client client_3 = Client();

        // Example of synchronously
        client_1.connect();
        System.out.println(client_1.getBMI(10.0, 20.0));
        client_1.disconnect();

        client_2.connect();
        System.out.println(client_2.getBMI(10.0, 20.0));
        client_2.disconnect();

        client_3.connect();
        System.out.println(client_3.getBMI(10.0, 20.0));
        client_3.disconnect();
        
        
        // Example of threading
        client_1.connect();
        client_2.connect();
        client_3.connect();

        System.out.println(client_1.getBMI(10.0, 20.0));
        System.out.println(client_2.getBMI(10.0, 20.0));
        System.out.println(client_3.getBMI(10.0, 20.0));

        client_1.disconnect();
        client_2.disconnect();
        client_3.disconnect();

    }
}
