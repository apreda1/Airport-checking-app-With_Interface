
package interface_abroadprog;

import java.util.Scanner;

public class Control implements Rules {
    
    private int ticket;
    private boolean passport;
    private boolean visa;

    public Control () {
    Scanner scanner = new Scanner(System.in);
        System.out.print("How much cash do you have on you? (should be over $100): ");
        this.ticket = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Do you have passport( yes or no ): ");
        String answer = scanner.nextLine();
        if (answer.equals("yes")){
            this.passport = true;
        }else {
            this.passport = false;
        }
        
        System.out.print("Do you have visa ( yes or no ): ");
        String answer2 = scanner.nextLine();
        if (answer2.equals("yes")){
            this.visa = true ;
        }else {
            this.visa = false;
        }
        
        
    }
    

    @Override
    public boolean Pasaport() {
        if (this.passport == true){
            System.out.println("You have valid passport");
            return true ;
        }else {
            System.out.println("You don't have passport. Go home.");
            return false;
        }
        
        
    }

    @Override
    public boolean Ticket() {
        if (this.ticket < 100){
            System.out.println("You don't have enough money: " + (100-ticket) + " more cash you need");
            return false;
        }else {
            System.out.println("You have enough money. Have Fun ! ");
            return true;
        }
    }

    @Override
    public boolean Visa() {
        if (this.visa == true ) {
            System.out.println("Your visa is good");
            return true;
        }else{
            System.out.println("You don't have visa :( ");
        }
        return false;
    }
    
    
}
