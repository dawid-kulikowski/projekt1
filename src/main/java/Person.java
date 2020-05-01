import org.w3c.dom.ls.LSOutput;

public class Person {
    private String name;
    private String surname;
    private int phone;

    public Person (String name, String surname, int phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        System.out.println("Wprowadzone przez Ciebie dane to: \n" +  "Imię - " + this.name + "\n" + "Nazwisko - " + this.surname + "\n" + "Numer Telefonu - " + this.phone);
    }
}
