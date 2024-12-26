package menus;
import data_structures.*;
import java.util.Scanner;
import utils.*;

public class ArrayMenu {

  public void displayMenu() {
    Scanner sc = new Scanner(System.in);
    int choice = -1;

    do { 
        System.out.println("Choose options:");
        System.out.println("[1] Create an Array");
        System.out.println("[2] Display the Array");
        System.out.println("[3] Delete an element of the array based on index");
        System.out.println("[4] Return to Main Menu");

        choice = sc.nextInt();

        switch(choice) {
          case 1: 
              ArrayMethods arr = new ArrayMethods();
              arr.createArray();
              break;
          case 2:
            
              break;
          
          case 3:

              break;

          case 4:
              // Back to Menu
              return;

          default:
              Utils.printInvalidChoice();
              Utils.pressKey();
        }
    } while (choice != 4);

    sc.close();
    
  }

}
