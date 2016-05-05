package ex2.readingnumbers;

import java.util.Scanner;

/**
 * Created by clouway on 15.04.16.
 */
public class DemoEx2 {
  public static void main(String[] args) throws ValueOutOfRange {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input value.");
    int n = sc.nextInt();

    Range zeroToOneHundred = new Range(0, 100);
    Range zeroToTen = new Range(0, 10);
    zeroToOneHundred.check(n);
  }
}
