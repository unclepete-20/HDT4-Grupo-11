/************************************
 * @author Gabriel Vicente 20498 y Pedro Arriola 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * Grupo #11
 ************************************/

/*
Codigo reutilizado del documento que se compartio en el modulo de listas encadenadas
*/
public class DoublyLinkedNode<T> {
    protected T data;
    protected DoublyLinkedNode<T> nextElement;
    protected DoublyLinkedNode<T> previousElement;

    public DoublyLinkedNode(T v, DoublyLinkedNode<T> next,DoublyLinkedNode<T> previous){
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(T v){
        this(v,null,null);
    }


    /**
     * @return DoubleNode<T>
     */
    public DoublyLinkedNode<T> next()
    // post: returns reference to next value in list
    {
       return nextElement;
    }


    /**
     * @param next
     */
    public void setNext(DoublyLinkedNode<T> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }


   /**
    * @return T
    */
   public T value()
   // post: returns value associated with this element
   {
      return data;
   }


   /**
    * @param value
    */
   public void setValue(T value)
   // post: sets value associated with this element
   {
      data = value;
   }


    /**
     * @return DoubleNode<T>
     */
    public DoublyLinkedNode<T> previous() {
        return null;
    }


    /**
     * @return T
     */
    public T get()
    {
        return null;
    }
}