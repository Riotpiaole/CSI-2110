/**
* @author Weizhe Liang
**/

public interface Vertex<V> {
  /**
  * set value for the Vertex
  *@params value V
  **/

  abstract void setValue(V value);

  /**
  * get value from the vertext
  *@return value
  **/

  abstract V getValue();
}
