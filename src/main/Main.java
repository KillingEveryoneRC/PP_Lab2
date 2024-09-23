package main;

import customers.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Customer> customers = createCustomers();

        // Покупці з даним іменем
        String targetName = "Іван";
        System.out.println("Список покупців із іменем " + targetName + ":");
        printCustomersByName(customers, targetName);

        // Номер картки в інтервалі
        String lowerLimit = "4000000000000000";
        String upperLimit = "5000000000000000";
        System.out.println("\nСписок покупців із номером кредитної картки в інтервалі:");
        printCustomersByCardRange(customers, lowerLimit, upperLimit);

        // Боржники
        System.out.println("\nСписок покупців із заборгованістю:");
        printCustomersWithDebt(customers);
    }

    // Створення карток
    public static List<Customer> createCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Коваль", "Іван", "Іванович", "Київ", "4065925781530260", 200.50));
        customers.add(new Customer(2, "Петренко", "Марія", "Петрівна", "Львів", "1591527392650163", -150.75));
        customers.add(new Customer(3, "Сидоренко", "Іван", "Васильович", "Одеса", "4729617284721583", 0));
        customers.add(new Customer(4, "Іванов", "Андрій", "Іванович", "Дніпро", "2628401752648194", 52.0));
        customers.add(new Customer(4, "Павлюк", "Володимир", "Богданович", "Сокаль", "8572849173645194", -12467.0));
        return customers;
    }

    // Пошук за іменем
    public static void printCustomersByName(List<Customer> customers, String firstName) {
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(firstName)) {
                System.out.println(customer);
            }
        }
    }

    // Пошук за номером картки в інтервалі
    public static void printCustomersByCardRange(List<Customer> customers, String lowerLimit, String upperLimit) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber().compareTo(lowerLimit) >= 0 && customer.getCreditCardNumber().compareTo(upperLimit) <= 0) {
                System.out.println(customer);
            }
        }
    }

    // Пошук боржників
    public static void printCustomersWithDebt(List<Customer> customers) {
        for (Customer customer : customers) {
            if (customer.getBalance() < 0) {
                System.out.println(customer);
            }
        }
    }
}