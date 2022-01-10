import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClientController clientController = new ClientController();



        clientController.readFromFile("kundendaten.txt");

        System.out.println(clientController.sortClients(clientController.getClientList()));

        clientController.writeToFile("kundensortiert.txt");

        clientController.statistic("statistik.txt");
    }
}
