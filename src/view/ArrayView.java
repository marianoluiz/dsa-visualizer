package view;

import java.util.Scanner;
import util.Utils;

public class ArrayView {
  Scanner sc = new Scanner(System.in);

  public void displayMenu() {
        Utils.cls();
        System.out.println("\n\nChoose options:");
        System.out.println("[1] Create an Array");
        System.out.println("[2] Display the Array");
        System.out.println("[3] Delete an element of the array based on index");
        System.out.println("[4] Return to Main Menu");

        System.out.print("\n\n> ");
  }

  public void displayArray(String[] Array) {
    if (Array != null) {
      System.out.print("Array: [");
      for (int i = 0; i < Array.length; i++) {
          if (i > 0)
              System.out.print(", ");

          System.out.print(Array[i]);
      }
      System.out.println("]");
    } else {
        System.out.println("Array is not set.");
    }

    Utils.pressKey();
  }

  public int getIndex() {
    System.out.print("Input index (starting 1): ");
    return sc.nextInt();
  }
}
