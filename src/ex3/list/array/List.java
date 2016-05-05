package ex3.list.array;

import ex3.list.exeptions.EmptyListException;
import ex3.list.exeptions.FullListException;

/**
 * Created by clouway on 15.04.16.
 */
public class List {
  private Object[] list;
  private int size;
  private int it = 0;

  public List(int size) {
    this.size = size;
  }


  /**
   * Creating the list.
   *
   * @param obj
   */
  public void add(Object obj) throws FullListException {
    if (list == null) {
      list = new Object[size];
    } else if (it == size) {
      throw new FullListException();
    } else {
      addNew(obj);
    }
  }

  /**
   * Removes the last element of the list.
   */
  public void remove() throws EmptyListException {
    if (list == null) throw new EmptyListException();
    if (list[0] != null) {
      if (list[it - 1] != null) {
        list[it - 1] = null;
        it--;
      }
    } else {
      throw new EmptyListException();
    }
  }

  /**
   * Printing the list.
   *
   * @return
   */
  public String print() {
    String str = list[0] + "";
    for (Object o : list) {
      str += ", " + o;
    }
    return str;
  }

  /**
   * Adds elements to the end of the list.
   *
   * @param obj
   */
  private void addNew(Object obj) {
    list[it] = obj;
    it++;
  }
}
