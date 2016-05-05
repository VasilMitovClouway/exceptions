package ex3.list.exeptions;

/**
 * Created by clouway on 18.04.16.
 */
public class FullListException extends Exception{
  public FullListException() {
    super("\nThe list is full. Can't add more elements.");
  }
}
