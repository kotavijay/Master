package session6.constructor;

public class VipCustomer {
    private final String name;
    private final double creditLimit;
    private final String emailAddress;

    public VipCustomer() {
        this("Default Name", 100D, "Default Email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default Email");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
