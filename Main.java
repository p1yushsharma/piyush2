
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        ATMOperations atmOperations = new ATMOperations(account);

        System.out.println("Welcome to the ATM!");
        boolean exit = false;

        while (!exit) {
            atmOperations.showMenu();
            try {
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                if (choice == 4) {
                    exit = true;
                }
                atmOperations.performOperation(choice);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }

        atmOperations.closeScanner();
    }
}
