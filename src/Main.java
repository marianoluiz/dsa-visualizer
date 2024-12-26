import java.util.Scanner;
import menus.ArrayMenu;
import utils.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
            // Clear screen
            Utils.cls();

            System.out.println("Pick a Data Structure:\n");
            System.out.println("1. Array");
            System.out.println("2. ");
            System.out.println("9. Exit\n\n");
            
            System.out.print("> ");
            
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    ArrayMenu arrMenu = new ArrayMenu();
                    arrMenu.displayMenu();

                break;

                case 2:
                
                break;
                
                case 9:
                    System.out.println("Exiting Program...");
                    return;

                default:
                    Utils.printInvalidChoice();
                    Utils.pressKey();
            }

        } while( choice!= 9 );

       sc.close();
    }
    
}
