public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      /*
      _____Menu_____
1: Say Hello
2: List My favorite foods
3: Exit

1
Hello Human
_____Menu_____
1: Say Hello
2: List My favorite foods
3: Exit

2
Apples, Bananas, Coconuts
_____Menu_____
1: Say Hello
2: List My favorite foods
3: Exit

3
Goodbye
      */
      
    }

    scanner.close();
  }
}