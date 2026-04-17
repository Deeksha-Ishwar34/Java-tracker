import java.util.Scanner;
public class task32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000; 

        while (true) {
            display();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(balance);
                    break;

                case 2:
                    balance = depositMoney(balance, sc);
                    break;

                case 3:
                    balance = withdrawMoney(balance, sc);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }
    

    public static void display() {
        System.out.println("\n1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public static void checkBalance(int balance) {
        System.out.println("Current Balance: " + balance);
    }

    public static int depositMoney(int balance, Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid amount");
        }
        return balance;
    }

    public static int withdrawMoney(int balance, Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Please collect your cash");
        } else {
            System.out.println("Insufficient balance or invalid amount ");
        }
        return balance;
    }
}
