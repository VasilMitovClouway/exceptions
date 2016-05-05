package ex3.list.linkedlist;

import ex3.list.exeptions.EmptyListException;
import ex3.list.exeptions.FullListException;

import java.util.ArrayList;

/**
 * Created by clouway on 18.04.16.
 */
public class ListEx3v2 {
  private ArrayList<Object> list = new ArrayList<>();
  private int size;

  public ListEx3v2(int size) {
    this.size = size;
  }

  public void add(Object obj) throws FullListException {
    if (list.size() >= size) {
      throw new FullListException();
    }
    list.add(obj);
  }

  public void remove() throws EmptyListException {
    if (list.size() == 0) {
      throw new EmptyListException();
    } else {
      list.remove(list.size() - 1);
    }
  }

  public String print() {
    String str = "";
    for (Object o : list) {
      str += o + "  ";
    }
    return str;
  }
}
