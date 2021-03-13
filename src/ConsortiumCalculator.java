import java.util.Scanner;

public class ConsortiumCalculator {
  java.util.Scanner input = new Scanner(System.in);

  int totalInstallments;
  int paidInstallments;
  float installmentsPrice;

  public void getInstallments() {
    System.out.println("Digite o total de prestações: ");
    totalInstallments = input.nextInt();
    System.out.println("Digite quantas prestações foram pagas: ");
    paidInstallments = input.nextInt();
    System.out.println("Digite o valor (fixo) das prestações: ");
    installmentsPrice = input.nextFloat();
  }

  public void calculate() {
    float totalPaid = installmentsPrice * paidInstallments;
    float unpaid = totalInstallments * totalPaid - paidInstallments;

    System.out.println("O total pago foi de: " + totalPaid);
    System.out.println("Falta pagar: " + unpaid);
  }
}
