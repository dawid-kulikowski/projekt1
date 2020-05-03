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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
