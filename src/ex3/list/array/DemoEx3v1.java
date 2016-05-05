package ex3.list.array;

import ex3.list.exeptions.EmptyListException;
import ex3.list.exeptions.FullListException;

/**
 * Created by clouway on 15.04.16.
 */
public class DemoEx3v1 {
  public static void main(String[] args) throws EmptyListException, FullListException {
    List l1 = new List(4);
    l1.add("sasa");
    l1.add(123);
    l1.add("EWQEW");
    l1.add(124);
    l1.add(12);
    //l1.add(12.4);
    System.out.println(l1.print());
    l1.remove();
    System.out.println(l1.print());
    l1.add(124);
//    l1.remove();l1.remove();
//    System.out.println(l1.print());
//    l1.remove();l1.remove();
//    System.out.println(l1.print());
//    l1.remove();
  }
}
