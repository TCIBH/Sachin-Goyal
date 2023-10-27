package OOPS;
import java.util.Scanner;
class Account{
   private double accountNumber;
    double balance;

    Scanner scan=new Scanner(System.in);
    public void openAccount()
    {
        System.out.println("enter account number");
        accountNumber= scan.nextDouble();
        System.out.println("enter balance");
        balance=scan.nextDouble();
    }
    public void showAccount()
    {
        System.out.println("Account Number=="+accountNumber);
        System.out.println("balance=="+balance);
    }
   public void deposit()
    {
        double amount;
        System.out.println("enter the amount you want to deposit");
        amount= scan.nextDouble();
        balance=balance+amount;
    }
    public void withdraw()
    {
        double amount;
        System.out.println("enter the amount you want to withdraw");
        amount= scan.nextDouble();
        if(balance>=amount) {
            balance = balance - amount;
            System.out.println("balance after withdraw::" + balance);
        }
        else{
            System.out.println("your balance is less than "+amount+"\t Transaction failed...!!!!");
        }
    }
    public boolean search(double ac_no)
    {
        if(accountNumber==ac_no){
            showAccount();
            return  true;
        }
        return  false;
    }

}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of customer we want in bank ");
        int number= scan.nextInt();
        Account C[]=new Account[number];
        for (int i=0;i<C.length;i++){
            C[i]=new Account();
        C[i].openAccount();}
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5. calculate the interest.\n 6. Exit  ");
            System.out.println("Enter your choice: ");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    double ac_no = scan.nextDouble();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = scan.nextDouble();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = scan.nextDouble();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;

                    case 5:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 5);
    }
}
