import java.util.Scanner;

public class DiscountCalculator {
  java.util.Scanner input = new Scanner(System.in);

  double price;
  double discount;

  double result;

  public void getPriceAndDiscount() {
    System.out.println("Digite o preço do produto: ");
    price = input.nextFloat();
    System.out.println("Digite o desconto do produto (em %): ");
    discount = input.nextFloat();
  }

  public void calculate() {
    double discountedPrice = price * discount / 100;
    result = price - discountedPrice;
    System.out.println("O produto de " 
                        + price 
                        + " passa a valer " 
                        + result 
                        + " após desconto de " 
                        + discountedPrice
                      );
  }
}
