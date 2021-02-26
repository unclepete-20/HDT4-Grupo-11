/************************************
 * @author Gabriel Vicente 20498 y Pedro Arriola 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * Grupo #11
 ************************************/

public class SinglyLinkedList<T> extends AbstractList<T> {

   protected int count; // list size
   protected Node<T> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }


   /**
    * @return int
    */
   @Override
   public int size() {
       return count;
   }


   /**
    * @param value
    */
   @Override
   public void add(T value) {
       // location for new value
      Node<T> temp = new Node<T>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<T> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }

         finger.setNext(temp);
      } else head = temp;

	  count++;
   }


   /**
    * @return T
    */
   @Override
   public T remove() {
       Node<T> temp = head;
       head = head.next(); // move head down list
       count--;
       return temp.value();

    }


   /**
    * @return T
    */
   @Override
   public T get() {
       return head.value();

    }

}