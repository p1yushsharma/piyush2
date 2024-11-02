import java.util.Scanner;

public class ATMOperations {
    private final Account account;
    private Scanner scanner;

    public ATMOperations(Account account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\nPlease select an option:");
        System.out.println("1: Check Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");
    }

    public void performOperation(int choice) {
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please select between 1 and 4.");
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    private void deposit() {
        try {
            System.out.print("Enter amount to deposit: $");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid amount.");
            scanner.next(); // Clear invalid input
        }
    }

    private void withdraw() {
        try {
            System.out.print("Enter amount to withdraw: $");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid amount.");
            scanner.next(); // Clear invalid input
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
