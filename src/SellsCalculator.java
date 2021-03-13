import java.util.Scanner;

public class SellsCalculator {
  java.util.Scanner input = new Scanner(System.in);

  double fruitsPrice = 2.5;
  double creammyPrice = 3.5;
  double stuffedPrice = 4.5;

  int fruitsAmount;
  int creamyAmount;
  int stuffedAmount;

  public void getAmounts() {
    System.out.println("Quantos picolés de fruta? ");
    fruitsAmount = input.nextInt();
    System.out.println("Quantos picolés cremosos? ");
    creamyAmount = input.nextInt();
    System.out.println("Quantos picolés com recheio? ");
    stuffedAmount = input.nextInt();
  }

  public void calculate() {
    double result = (fruitsAmount * 2.5) + (creamyAmount * 3.5) + (stuffedAmount * 4.5);

    System.out.println("O resultado da sua compra é: " + result);
  }
}
