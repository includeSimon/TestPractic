import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ClientController {
    private List<Client> clientList = new ArrayList<>();

    public List<Client> readFromFile(String fileName) throws IOException {
        File myObj = new File(fileName);
        Scanner myReader = new Scanner(myObj);

        Client client;
        List<Client> listeCliente = new ArrayList<>();
        String[] attributeList;
        while (myReader.hasNextLine()) {
            attributeList = myReader.nextLine().split(",");
            client = new Client(Integer.parseInt(attributeList[0]), attributeList[1], Size.valueOf(attributeList[2]),Integer.parseInt(attributeList[3]),Integer.parseInt(attributeList[4]),attributeList[5]);
            clientList.add(client);
        }


        return clientList;
    }

    public void writeToFile(String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Client client : clientList) {
            String line =
                    client.getId()
                            + ','
                            + client.getcompanyName()
                            + ','
                            + client.getCompanySize()
                            + ','
                            + client.getNumberOfWorkers()
                            + ','
                            +client.getClientIncome()
                            +','
                            +client.getCity();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public void statistic(String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        Map<String,Integer> cityIncome = new HashMap<>();

        for (Client client : clientList){
            if (!cityIncome.containsKey(client.getCity())){
                cityIncome.put(client.getCity(), client.getClientIncome());
            } else {
                cityIncome.put(client.getCity(), cityIncome.get(client.getCity()) + client.getClientIncome());
            }
        }
        

        for (String cityName : cityIncome.keySet()){
            bufferedWriter.write(cityName + ':' + cityIncome.get(cityName));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }


    public List<Client> sortClients(List<Client> clientList){

        Collections.sort(clientList,
                Comparator.comparingInt(
                        Client::getNumberOfWorkers));

        return clientList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
