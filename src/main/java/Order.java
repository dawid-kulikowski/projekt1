public class Order {

    private String device;
    private String model;
    private String problem;

    public Order (String device, String model, String problem) {
        this.device = device;
        this.model = model;
        this.problem = problem;
        System.out.println("Dane Zamówienia: \n" +  "Urządzenie - " + this.device + "\n" + "Model - " + this.model + "\n" + "Usterka - " + this.problem);
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }


    
}
