package JuniorsPractice;
import java.util.Scanner;
class Account {
    int accountNo;
    String accountHolderName;
    double balance;
    void createAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = name;
        this.balance = balance;
    }
    void depositAmount(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }
    void withdrawAmount(double amount) {
        if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
    void display() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Total Balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers:");
        int n = sc.nextInt();
        Account[] accounts = new Account[n];
        for (int i = 0; i < n; i++) {
            accounts[i] = new Account();
            System.out.println("\nEnter details for customer " + (i + 1));
            System.out.print("Account No: ");
            int accNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            accounts[i].createAccount(accNo, name, balance);
        }
        while (true) {
            System.out.println("\n---- BANK MENU ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance View");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            if (choice == 4) {
                System.out.println("Thank you for using bank system");
                break;
            }
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            Account current = null;
            for (Account a : accounts) {
                if (a.accountNo == accNo) {
                    current = a;
                    break;
                }
            }
            if (current == null) {
                System.out.println("Account not found");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    current.depositAmount(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    current.withdrawAmount(wit);
                    break;
                case 3:
                    current.display();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}