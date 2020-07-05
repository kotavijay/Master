package session6;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
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
