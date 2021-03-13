import java.util.Scanner;

public class InvertValues {
  java.util.Scanner input = new Scanner(System.in);

  float value1;
  float value2;

  public void getValues() {
    System.out.println("Digite o primeiro valor: ");
    value1 = input.nextFloat();
    System.out.println("Digite o segundo valor: ");
    value2 = input.nextFloat();
  }

  public void invert() {
    float placeholder1 = value1;
    float placeholder2 = value2;
    value1 = placeholder2;
    value2 = placeholder1;

    System.out.println("O primeiro valor agora é: " + value1);
    System.out.println("O segundo valor agora é: " + value2);
  }
}
