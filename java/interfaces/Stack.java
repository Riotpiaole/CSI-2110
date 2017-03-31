/**
  *  Stack Abstract Data Type
  *  First in first out
  *@author Weizhe Liang
**/


public interface  Stack<E>{

  /**
    * IsEmpty() check stack is Empty?
  **/

  public abstract boolean isEmpty();

  /**
    * peek() references for the top of the stack
    * @return E generic data type
  **/

  public abstract E peek();

  /**
    *pop() remove the first element for the stack
    *@return E generic data type
  **/

  public abstract E pop();

  /**
    *push(E elem) push an element into the top of the stack
    *@params E generic data elements
  **/

  public abstract void push(E elem);
}
