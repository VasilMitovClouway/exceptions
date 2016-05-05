package ex3.list.exeptions;

/**
 * Created by clouway on 18.04.16.
 */
public class EmptyListException extends Exception{
  public EmptyListException(){
    super("\nList is empty. There is nothing to remove.");
  }
}
