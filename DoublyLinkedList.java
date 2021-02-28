/************************************
 * @author Gabriel Vicente 20498 y Pedro Arriola 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * Grupo #11
 ************************************/

public class DoublyLinkedList<T> extends AbstractList<T> {

    protected int count;
    protected DoublyLinkedNode<T> head;
    protected DoublyLinkedNode<T> tail;

    public DoublyLinkedList()
    // post: constructs an empty list
    {
    head = null;
    tail = null;
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

        // construct a new element, making it head
        head = new DoublyLinkedNode<T>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }


    /**
     * @return T
     */
    @Override
    public T remove() {

        DoublyLinkedNode<T> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }


    /**
     * @return T
     */
    @Override
    public T get() {
        return head.get();
    }

}
