public class CheckingAccount extends BankAccount{
    public double amount;
    private double maximumWithdrawalBalance;

    public CheckingAccount(String accountNumber, double maximumWithdrawalBalance) {
        super(accountNumber); //super here is calling the constructor of the superclass - BankAccount
        this.maximumWithdrawalBalance = maximumWithdrawalBalance;
    }

    //override
    public void withdraw(double amount) {
        if (amount <= balance + maximumWithdrawalBalance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Exceeds maximum withdrawal Balance");
        }
    }
}
