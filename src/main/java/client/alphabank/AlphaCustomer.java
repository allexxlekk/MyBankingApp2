package client.alphabank;

public class AlphaCustomer {

    private String name;
    private String surname;
    private double balance;
    private ALPHA_STATUS status;
    private double bonus;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public ALPHA_STATUS getStatus() {
        return status;
    }

    public double getBonus() {
        return bonus;
    }

    public AlphaCustomer(String name, String surname, double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }
}
