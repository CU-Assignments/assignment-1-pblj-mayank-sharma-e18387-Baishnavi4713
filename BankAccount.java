import java.util.Scanner;

class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal Failed: Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + ". New Balance: ₹" + balance);
        }
    }

    public void displayDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Initial Balance: ₹");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, initialBalance);

        account.displayDetails();

        System.out.print("\nEnter amount to Deposit: ₹");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to Withdraw: ₹");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
