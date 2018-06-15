package Bankomat;

public class BankTest {
    public static void main(String[] args) {
        Person person = new Person("Damian", "Waza");
        BankAccount bankAccount = new BankAccount(person, 25000);
        BankAccount bankAccount2 = new BankAccount(null, 25000);

        person.showInfo();
        System.out.println(bankAccount2);
    }

}
