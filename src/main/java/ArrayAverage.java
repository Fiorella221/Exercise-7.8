import java.util.Scanner;

public class ArrayAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] doubleArray = new double[10];

    System.out.println("Enter 10 numbers: ");
    for(int i = 0; i < doubleArray.length; i++) {
        doubleArray[i] = input.nextDouble();
    }

    double averageValue = ArrayAverage.average(doubleArray);
    System.out.println("The average value is " + averageValue);
    input.close();
  }

  public static int average(int[] array) {
    int sum = 0;
    for(int num: array) {
         sum += num;
    }
    
    return sum/array.length;
  }

  public static double average(double[] array) {
    double sum = 0;
    for(double num: array) {
        sum += num;

    }
    return sum/array.length;
    
  }
}