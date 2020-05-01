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
    
}
