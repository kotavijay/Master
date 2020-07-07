package session6.constructor;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setColor("Black");
        porsche.setDoors(2);
        porsche.setModel("Carrera");
        porsche.setEngine("V8");
        porsche.setWheels(4);

        System.out.println("\n/********************/\n");

        System.out.println(porsche.getModel());

        System.out.println("\n/********************/\n");

//        Assignment
        BankAccount vijay = new BankAccount();

        System.out.println("\n/********************/\n");

        System.out.println(vijay.getBalance());
        System.out.println(vijay.getAccountNumber());

        System.out.println("\n/********************/\n");

        vijay.setAccountNumber("111111114351");
        vijay.setBalance(10_000D);
        vijay.setCustomerName("Vijay");
        vijay.setEmail("vijay.kota5@outlook.com");
        vijay.setPhoneNumber("+91 8099662808");

        vijay.depositAmount(10_000D);

        vijay.withdrawal(500D);

        vijay.withdrawal(40000D);

        System.out.println("\n/********************/\n");

        BankAccount ajay = new BankAccount("2222222222", 20_324, "Ajay", "jamjyouthiajay@gmail.com", "+91 9999999999");

        ajay.withdrawal(10_324D);

        ajay.depositAmount(876D);

        ajay.withdrawal(47_987);

        System.out.println("\n/********************/\n");

//        Assignment
//        VipCustomer vipCustomer = new VipCustomer();
//        VipCustomer vipCustomer = new VipCustomer("vijay", 200D);
        VipCustomer vipCustomer = new VipCustomer("vijay", 300D, "vijay.kota5@outlook.com");
        System.out.println("name: " + vipCustomer.getName());
        System.out.println("credit limit: " + vipCustomer.getCreditLimit());
        System.out.println("email: " + vipCustomer.getEmailAddress());

    }
}
