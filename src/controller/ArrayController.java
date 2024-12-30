package controller;

import java.util.Scanner;
import model.ArrayModel;
import util.Utils;
import view.ArrayView;

public class ArrayController {
  private ArrayModel model;
  private ArrayView view;

  public ArrayController(ArrayModel model, ArrayView view) {
      this.model = model;
      this.view = view;
  }

  public void run() {
    Scanner sc = new Scanner(System.in);
    int choice;

    do { 
        view.displayMenu();

        choice = sc.nextInt();
        
        switch(choice) {
          case 1: 
              model.createArray();
              break;

          case 2:
              view.displayArray(model.getArray());
              break;
      
          case 3:
              int intDelIndex = view.getIndex();
              model.deleteArray(intDelIndex);
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
