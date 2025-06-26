import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double balance;
    boolean isRunning = true;
    int choice;

    System.out.println("Banking Program");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");

    System.out.println("Enter your choice (1-4): ");
    choice = scanner.nextInt();

    switch(choice){
        case 1 -> System.out.println("Show Balance");
        case 2 -> System.out.println("Deposit");
        case 3 -> System.out.println("Withdraw");
        case 4 -> isRunning = false;
        default -> System.out.printlnq("Invalid Choice")
    }


    scanner.close()

    }
}