package util;

import java.io.IOException;

public class Utils {

  public static void pressKey() {
    System.out.println("\nPress Any Key to Continue...");
    
    try {
        System.in.read();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }

  public static void printInvalidChoice() {
    System.out.println("Invalid, Please try again,");
  }

  public static void cls() {
    System.out.print("\033[H\033[2J");
  }

}
