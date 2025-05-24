public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 1;
    int sum = 0;

    while (count <= 20) {
      sum += count;
      count++;
    }

    System.out.println("The sum of numbers from 1 to 20 is: " + sum);
  }
}