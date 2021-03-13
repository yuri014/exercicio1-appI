import java.util.Scanner;

public class ProductCalculator {
  java.util.Scanner input = new Scanner(System.in);

  float firstNumber;
  float secondNumber;
  float thirdNumber;
  float fourthNumber;

  float firstProduct;
  float secondProduct;

  float result;

  public void getNumbers() {
    System.out.println("Digite o primeiro número do seu primeiro produto: ");
    firstNumber = input.nextFloat();
    System.out.println("Digite o segundo número do seu primeiro produto: ");
    secondNumber = input.nextFloat();
    System.out.println("Digite o primeiro número do seu segundo produto: ");
    thirdNumber = input.nextFloat();
    System.out.println("Digite o segundo número do seu segundo produto: ");
    fourthNumber = input.nextFloat();
  }

  public void calculate() {
    firstProduct = firstNumber * secondNumber;
    secondProduct = thirdNumber * fourthNumber;

    result = firstProduct + secondProduct;

    System.out.println("O resultado do primeiro produto é: " + firstProduct);
    System.out.println("O resultado do segundo produto é: " + secondProduct);

    System.out.println("O resultado da soma dos produtos é: " + result);
  }
}
