import controller.ArrayController;
import java.util.Scanner;
import model.ArrayModel;
import util.*;
import view.ArrayView;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
            // Clear screen
            Utils.cls();

            System.out.println("Pick a Data Structure:\n");
            System.out.println("1. Array");
            System.out.println("2. Stacks");
            System.out.println("9. Exit");
            
            System.out.print("\n\n> ");
            
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    ArrayModel model = new ArrayModel();
                    ArrayView view = new ArrayView();
                    ArrayController controller = new ArrayController(model, view);
                    controller.run();
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
