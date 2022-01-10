public class Client {
    private int id;
    private String companyName;
    private Size companySize;
    private int numberOfWorkers;
    private int clientIncome;
    private String city;


    public Client(int id, String companyName, Size companySize, int numberOfWorkers, int clientIncome, String city) {
        this.id = id;
        this.companyName = companyName;
        this.companySize = companySize;
        this.numberOfWorkers = numberOfWorkers;
        this.clientIncome = clientIncome;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcompanyName() {
        return companyName;
    }

    public void setcompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Size getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Size companySize) {
        this.companySize = companySize;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public int getClientIncome() {
        return clientIncome;
    }

    public void setClientIncome(int clientIncome) {
        this.clientIncome = clientIncome;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", companySize=" + companySize +
                ", numberOfWorkers=" + numberOfWorkers +
                ", clientIncome=" + clientIncome +
                ", city='" + city + '\'' +
                '}';
    }
}
