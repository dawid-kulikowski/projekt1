

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj swoje imię:");
        Scanner name = new Scanner(System.in);
        String x = name.nextLine();

        System.out.println("Podaj swoje nazwisko:");
        Scanner surname = new Scanner(System.in);
        String y = name.nextLine();

        System.out.println("Podaj numer telefonu:");
        Scanner phone = new Scanner(System.in);
        int z = phone.nextInt();

        System.out.println("Podaj typ urządzenia:");
        Scanner device = new Scanner(System.in);
        String a = device.nextLine();

        System.out.println("Podaj model urządzenia:");
        Scanner model = new Scanner(System.in);
        String b = model.nextLine();

        System.out.println("Podaj usterkę urządzenia:");
        Scanner problem = new Scanner(System.in);
        String c = problem.nextLine();

        new Person(x,y,z);
        new Order(a,b,c);

        }
    }

