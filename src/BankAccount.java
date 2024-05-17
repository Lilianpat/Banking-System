public class BankAccount {

    public String accountNumber;
    public double balance;


    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    //method for deposit
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited into account " + accountNumber);
    }

    //method for withdrawal
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    //method for balance inquiry
    public double getBalance() {
        return balance;
    }


}
