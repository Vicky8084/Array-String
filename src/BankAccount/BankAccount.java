package BankAccount;

import java.util.Scanner;

class Account{
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    public Account(int accountNumber, String accountHolderName, double accountBalance){
        this.accountBalance=accountBalance;
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }

    public void display(){
        System.out.println("Account Holder Name :- " + accountHolderName);
        System.out.println("Account Number :- " + accountNumber);
        System.out.println("Account Balance :- " + accountBalance);
        System.out.println();
    }
    public void displayAllCustomer(Account[] acc){
        for (int i=0;i<acc.length;i++){
            acc[i].display();
        }
    }

    public void withdrawAmount(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount..");
            return;
        }
        if(accountBalance<amount){
            System.out.println("Insufficient Balance");
        }else{
            accountBalance=accountBalance-amount;
            System.out.println("Withdrawal Success..!!");
        }
    }
    public void depositAmount(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
            return;
        }
        accountBalance=accountBalance+amount;
        System.out.println("Deposit Success..!!");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Total Number of Customer :- ");
        int n=scanner.nextInt();
        Account[] accounts=new Account[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter ["+(i+1)+"]th Customer Details :- ");
            System.out.print("Enter Account Number :- ");
            int accountNumber=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Account Holder Name :- ");
            String accountHolderName=scanner.nextLine();
            System.out.print("Enter Account Balance :- ");
            double accountBalance=scanner.nextDouble();
            accounts[i]=new Account(accountNumber,accountHolderName,accountBalance);
        }
        while (true){
            System.out.println("\n-*-*-*-*Bank Menu*-*-*-*-");
            System.out.println("1. Display All Customer");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Balance View");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice :- ");
            int ch=scanner.nextInt();
            if(ch==5){
                System.out.println("Thank you for Visiting Bank....");
                break;
            }
            System.out.print("Enter Account Number ");
            int accNumber=scanner.nextInt();
            Account current=null;
            for (Account a : accounts){
                if (a.getAccountNumber()==accNumber){
                    current=a;
                    break;
                }
            }

            if(current==null){
                System.out.println("Account is not found..");
                continue;
            }

            switch (ch){
                case 1 :
                    System.out.println("All Customers..");
                    for(Account account: accounts){
                        account.display();
                    }
                    break;
                case 2 :
                    System.out.println("Withdraw Amount...");
                    System.out.print("Enter Amount to Withdraw :- ");
                    double with=scanner.nextDouble();
                    current.withdrawAmount(with);
                    break;
                case 3 :
                    System.out.println("Deposit Amount..");
                    System.out.print("Enter Amount to Deposit :- ");
                    double dep=scanner.nextDouble();
                    current.depositAmount(dep);
                    break;
                case 4 :
                    System.out.println("Balance Check..");
                    current.display();
                    break;
                default:
                    System.out.println("Invalid Option");
            }

        }
    }
}
