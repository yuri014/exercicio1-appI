import java.util.Scanner;

public class PriceCalculator {
  java.util.Scanner input = new Scanner(System.in);

  double price;

  double priceWithDiscount;

  public void getPrice() {
    System.out.println("Digite o preço do produto: ");
    price = input.nextFloat();
  }

  public void calculate() {
    priceWithDiscount = price * 0.10;

    System.out.println("O resultado com desconto é de: " + priceWithDiscount);
  }
}
