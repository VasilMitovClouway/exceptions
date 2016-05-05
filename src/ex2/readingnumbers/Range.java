package ex2.readingnumbers;

/**
 * Created by clouway on 19.04.16.
 */
public class Range {
  private final int min;
  private final int max;

  public Range(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public void check(int n) throws ValueOutOfRange {
    if (n < min || n > max) {
      throw new ValueOutOfRange(min, max);
    }
  }

  private void check(int n, int min, int max) throws ValueOutOfRange {
    if (n < min || n > max) {
      throw new ValueOutOfRange(min, max);
    }
  }
}
