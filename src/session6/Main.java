package session6;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setColor("Black");
        porsche.setDoors(2);
        porsche.setModel("Carrera");
        porsche.setEngine("V8");
        porsche.setWheels(4);

        System.out.println(porsche.getModel());

//        Assignment
        BankAccount vijay = new BankAccount();

        System.out.println(vijay.getBalance());
        System.out.println(vijay.getAccountNumber());


        vijay.setAccountNumber("111111114351");
        vijay.setBalance(10_000D);
        vijay.setCustomerName("Vijay");
        vijay.setEmail("vijay.kota5@outlook.com");
        vijay.setPhoneNumber("+91 8099662808");

        vijay.depositAmount(10_000D);

        vijay.withdrawal(500D);

        vijay.withdrawal(40000D);

        System.out.println("/*************************/");

        BankAccount ajay = new BankAccount("2222222222", 20_324, "Ajay", "jamjyouthiajay@gmail.com", "+91 9999999999");

        ajay.withdrawal(10_324D);

        ajay.depositAmount(876D);

        ajay.withdrawal(47_987);

    }
}
