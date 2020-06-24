
package interface_abroadprog;

public class Interface_AbroadProg {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to SLC Airport");
        String rules = "CHECK IN Controls\n"
                +"1. Pasaport\n"
                +"2. Visa\n"
                +"3. Money ( you should have over $100 )\n";
        String message = "You need to have all 3 conditions. You can't go :( ";
        
        while (true) {
            System.out.println("***********************************");
            System.out.println(rules);
            System.out.println("***********************************");
            
            Control control = new Control();
            
            System.out.println("Checking money please wait...");
            Thread.sleep(3000);
            if (control.Ticket() == false ){
                System.out.println(message);
                continue; // Continue yaptigimiz zaman dongunun en basina gider
            }
            
            System.out.println("Checking passaport information...");
            Thread.sleep(3000);
            if ( control.Pasaport()== false ){
                System.out.println(message);
                continue;
            }
            System.out.println("Checking visa information...");
            Thread.sleep(3000);
            if ( control.Visa() == false ){
                System.out.println(message);
                continue;
        }
        
            System.out.println("Congrats... you can travel HAVE FUN!");
            break;
        
       
    }
    
}
}
