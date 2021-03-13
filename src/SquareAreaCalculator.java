import java.util.Scanner;

public class SquareAreaCalculator {
  java.util.Scanner input = new Scanner(System.in);

  float side;
  float area;

  public void getSquareSide() {
    System.out.println("Digite a medida lateral do quadrado: ");
    side = input.nextFloat();
  }

  public void calculate() {
    area = side * side;

    System.out.println("A área do quadrado é: " + area); 
  }
}
