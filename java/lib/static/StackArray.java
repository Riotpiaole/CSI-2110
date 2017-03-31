/**
* Stack Array implementations
* @author Weizhe Liang
**/

public class StackArray<E> implements Stack<E>{

  private E[] elems;
  private int top;

  @SuppressWarnings("unchecked")

  /**
  *Constructor
  *Init a given size array
  *Static unExpandable structures
  **/

  public StackArray (int cap){
    elems=(E[]) new Object[cap];
    top=0;
  }

  /**
  *@Override
  *isEmpty() check whether or not the stack is empty
  *@return boolean
  **/

  @Override
  public boolean isEmpty(){
    return top == 0;
  }


  /**
  *@Override
  *push(E elem) place or push an Elem into the stack
  *@params E elem a generic dataType
  **/

  @Override
  public void push(E elem){
    if(top < elem.length){
      elem[top] = elem;
      top+=1;
    }else{
      throw new ArrayIndexOutOfBouncesException();
    }
  }

  /**
  *@Override
  *pop() pop off the fist element from the stack
  *@return saved
  **/

  @Override
  public E pop(){
    if(!isEmpty()){
      E saved;

      top-=1;
      saved = elem[top];
      elem[top] = null;

      return saved;
    }
    return null;
  }


  /**
  *@Override
  *peek() return the first trace on the stack
  *@return elem E generic dataType
  **/

  public E peek(){
    return elem[top-1];
  }
}
