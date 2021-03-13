import java.util.Scanner;

public class AverageCalculator {
  java.util.Scanner grade = new Scanner(System.in);
  
  float firstGrade;
  float secondGrade;
  float thirdGrade;
  
  float average;

  public void getGrades() {
    System.out.println("Digite a sua primeira nota: ");
    firstGrade = grade.nextFloat();
    System.out.println("Digite a sua segunda nota: ");
    secondGrade = grade.nextFloat();
    System.out.println("Digite a sua terceira nota: ");
    thirdGrade = grade.nextFloat();
  }

  public void calculate() {
    average = (firstGrade + secondGrade + thirdGrade) / 3;
    System.out.println("Sua média foi de: " + average);
  }
}
