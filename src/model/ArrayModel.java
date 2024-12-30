package model;
import java.util.Scanner;
import util.*;

public class ArrayModel {
  private String[] Array;
  Scanner sc = new Scanner(System.in);

  public String[] getArray() {
    return Array;
  }

  public void createArray() {
    System.out.print("Enter the size of the array: ");
    int sizeArr = sc.nextInt();
    Array = new String[sizeArr];
    
    for(int i = 0; i < sizeArr; i++ ) {
        System.out.print("Enter Value the Element [" + (i + 1) + "] of the Array: ");
        Array[i] = sc.next();
    }
  }

  public void deleteArray(int delIndex) {
    // starting 0 in here
    delIndex -= 1;

    if (Array == null ||  delIndex < 0 || delIndex >= Array.length ) {
        System.out.println("Nothing to delete");

        Utils.pressKey();
    } else {
        String[] newArray = new String[Array.length - 1];
        for( int i = 0, j = 0; i < Array.length; i++ ) {
            if( i != delIndex ) {
                newArray[j++] = Array[i]; // Post increment (after assigning)
            }
        }

        Array = newArray;
        System.out.println("Element " + delIndex + " deleted successfully.");
    }
  }
}
