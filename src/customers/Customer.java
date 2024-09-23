package customers;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String creditCardNumber;
    private double balance;

    // Конструктор
    public Customer(int id, String lastName, String firstName, String middleName, String address, String creditCardNumber, double balance) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "[Customer Information] " +
                "ID:" + id +
                ", Прізвище: '" + lastName + '\'' +
                ", Ім`я: '" + firstName + '\'' +
                ", По-батькові: '" + middleName + '\'' +
                ", Місто: '" + address + '\'' +
                ", Номер: '" + creditCardNumber + '\'' +
                ", Баланс:" + balance +
                '}';
    }
}