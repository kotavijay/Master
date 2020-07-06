package session6.constructor;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("1111111111", 2.50, "Default Name", "Default Email", "Default Number");
        System.out.println("Constructor with no parameters called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositAmount(double balance) {
        this.balance += balance;
        System.out.println("Deposit of " + balance + " made. Available balance: " + this.balance);
    }

    public void withdrawal(double balance) {
        if (this.balance - balance < 0) {
            System.out.println("Withdrawal not processed. Entered balance: " + balance + " Available balance: " + this.balance);
        } else {
            this.balance -= balance;
            System.out.println("Withdrawal of " + balance + " processed.  Available balance: " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
