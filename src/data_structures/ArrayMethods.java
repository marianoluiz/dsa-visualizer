package data_structures;
import java.util.Scanner;

public class ArrayMethods {
  private int[] arr;
  Scanner sc = new Scanner(System.in);

  public void createArray() {
    int sizeArr = sc.nextInt();
    String[] newArray = new String[sizeArr];
    int i = 0;

    while( i < sizeArr ) {
        System.out.println("Enter Value the Index [" + (i + 1) + "] of the Array");
        newArray[i] = sc.next();
    }
  }

  public void printArray() {
      if (arr != null) {
          for (int i : arr) {
              System.out.println(i);
          }
      } else {
          System.out.println("Array is not set.");
      }
  }


}
