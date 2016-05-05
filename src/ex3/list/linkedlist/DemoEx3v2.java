package ex3.list.linkedlist;

import ex3.list.exeptions.EmptyListException;
import ex3.list.exeptions.FullListException;

import java.util.Scanner;

/**
 * Created by clouway on 18.04.16.
 */
public class DemoEx3v2 {
  public static void main(String[] args) throws EmptyListException, FullListException {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the size of the list");
    int n = sc.nextInt();
    ListEx3v2 li = new ListEx3v2(n);
    for (int i= 0; i < n; i++){
      System.out.println("Input the value to be added.");
      li.add(sc.next());
    }
    System.out.println(li.print());
//    li.add(2);
    li.remove();li.remove();li.remove();li.remove();
    System.out.println(li.print());
//    ListEx3v2 li = new ListEx3v2(5);
//    li.add(2); li.add("sas"); li.add(2.23); li.add("zaz"); li.add(-12312); li.add(123);
//    System.out.println(li.print());
//    li.remove();
//    System.out.println(li.print());
  }
}
