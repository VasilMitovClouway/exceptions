package ex1.stringsumator;

import java.util.Scanner;

/**
 * Created by clouway on 15.04.16.
 */
public class DemoEx1 {
  public static void main(String[] args) throws IntegersOnlyStringException {
    Arithmetic sumator = new Arithmetic();
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String sum = "";
    try {
      sum = sumator.Sum(str1, str2);
    } catch (NumberFormatException e) {
      throw new IntegersOnlyStringException();
    }
    System.out.println(sum);
  }
}
