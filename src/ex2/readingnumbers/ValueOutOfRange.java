package ex2.readingnumbers;

/**
 * Created by clouway on 15.04.16.
 */
public class ValueOutOfRange extends Exception {
  public ValueOutOfRange(int min, int max) {
    super("\nThe value must be > " + min + " and < " + max + ".");
  }
}
