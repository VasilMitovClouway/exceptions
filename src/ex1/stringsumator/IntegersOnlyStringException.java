package ex1.stringsumator;

/**
 * Created by clouway on 18.04.16.
 */
public class IntegersOnlyStringException extends Exception{
  public IntegersOnlyStringException() {
    super("\nThe value  must be an Integer number.");
  }
}