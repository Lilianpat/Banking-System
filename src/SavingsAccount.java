public class SavingsAccount extends BankAccount{

    private double interestRate;
    private double accountAlert;

    public SavingsAccount(String accountNumber, double interestRate, double accountAlert) {
        super(accountNumber); //super here is calling the constructor of the superclass - BankAccount
        this.interestRate = interestRate;
        this.accountAlert = accountAlert;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance = balance + interest;
        System.out.println("Interest of " + interest + " added to account " + accountNumber);
    }

    public void largeWithdrawals() {
        if (balance < accountAlert) {
            System.out.println("ALERT: Your savings account balance is below the threshold: " + accountAlert);
        }
    }



}
