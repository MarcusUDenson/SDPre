import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    // Please give me a number: 2
Please give me another number: 8

========= MENU =========
|                      |
|   1. Add Numbers     |
|   2. Find Average    |
|   3. Calculate Tax   |
|   4. Exit            |
|                      |
========================
    */

    // Which would you like to do? 1
2.0 + 8.0 = 10.0

========= MENU =========
|                      |
|   1. Add Numbers     |
|   2. Find Average    |
|   3. Calculate Tax   |
|   4. Exit            |
|                      |
========================
    */

    while (keepGoing) {
      printMenu();
      System.out.print("Which would you like to do? ");
      choice = kb.nextInt();

      switch (choice) {
      // Which would you like to do? 2
The average of 2.0 and 8.0 is: 5.0

========= MENU =========
|                      |
|   1. Add Numbers     |
|   2. Find Average    |
|   3. Calculate Tax   |
|   4. Exit            |
|                      |
========================
      */


      }

    }
    kb.close();

  }

  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }
  Which would you like to do? 3
The amount in tax to be collected from a purchase of 2.0 and 8.0 is: 0.831

========= MENU =========
|                      |
|   1. Add Numbers     |
|   2. Find Average    |
|   3. Calculate Tax   |
|   4. Exit            |
|                      |
========================

Which would you like to do? 5
Invalid entry.  Please try again

========= MENU =========
|                      |
|   1. Add Numbers     |
|   2. Find Average    |
|   3. Calculate Tax   |
|   4. Exit            |
|                      |
========================

Which would you like to do? 4
You've chosen to quit.

}