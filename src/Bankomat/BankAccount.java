package Bankomat;

public class BankAccount {
    private Person person;
    private double amount;
    private final double LIMIT = 10000;


    public BankAccount(Person person, double amount) {
        this.person = person;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
        if (person == null) {
            System.out.println("Brak danych!" + person);
        }
    }
}
