import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;
    public static void main(String[] args){

        boolean isRunning = true;
        

        while (isRunning) {
            
            
            int choice; 
    
            System.out.println("------------");
            System.out.println("BANK PROGRAM");
            System.out.println("------------");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4. Exit");
            System.out.println("------------");
    
            System.out.print("Enter your choice (1-4):");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 -> isRunning = false;
    
                default -> System.out.println("INVALID CHOICE");
            }

        } 
        
        System.out.println("Thank you! Have a nice day!");
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit(){
     
        double amount;
    
        System.out.print("Enter an amount to be deposit: ");
        amount = scanner.nextDouble();
        
        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(){
     
        double amount;
    
        System.out.print("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();
        
        if(amount > balance){
            System.out.println("Amount can't be greater than balance");
            return 0;
        }
        else if(amount <= 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

   
}