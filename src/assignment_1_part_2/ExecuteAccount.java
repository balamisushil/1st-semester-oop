package assignment_1_part_2;

class Account {
    private int accountNumber;
    private double balance;
    private double annualInterestRate;

    public Account(int accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

class SavingAccount extends Account {
    public SavingAccount(int accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class TestAccount {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1, 1000, 0.02, 500);
        SavingAccount savingAccount = new SavingAccount(2, 1000, 0.03);

        System.out.println("Checking Account:");
        checkingAccount.deposit(200);
        checkingAccount.withdraw(1500);
        System.out.println(checkingAccount);

        System.out.println("\nSaving Account:");
        savingAccount.deposit(200);
        savingAccount.withdraw(1500);
        System.out.println(savingAccount);
    }
}
