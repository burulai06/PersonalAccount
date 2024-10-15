public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(230107006, "Tokobaeva Burulai");

        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(50.00);
        account.deposit(100.00);

        System.out.println("Current Balance: " + account.getBalance());
        account.printTransactionHistory();
    }
}
