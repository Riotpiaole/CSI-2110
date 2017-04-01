/**
* @author Weizhe Liang
**/

public interface Entry<K,V>{

  /**
  *@return  entry's key K datatype
  **/

  public abstract K getKey();

  /**
  * assign a key for the entry
  * @paramas key
  **/

  public abstract void setKey(K key);


  /**
  *return entry's value
  *@return entry's value V datatype
  **/

  public abstract V getValue();

  /**
  *assign value for the entry
  *@paramas value
  **/
  public abstract void setValue(V value);


  /**
  *assign a comparable methods equals for current entry
  *@paramas Object o
  *@return boolean
  **/
  public abstract boolean equals(Object o);
}
