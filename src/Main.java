public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("9037549226", 0.02, 100);

        CheckingAccount checkingAccount = new CheckingAccount("9037549226", 1000.0);

        savingsAccount.deposit(1000.0);
        checkingAccount.deposit(2000.0);

        savingsAccount.withdraw(200.0);

        savingsAccount.addInterest();
        savingsAccount.largeWithdrawals();
        checkingAccount.withdraw(5000);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());


    }
}