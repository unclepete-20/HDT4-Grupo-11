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

    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(T value) {

        // construct a new element, making it head
        head = new DoublyLinkedNode<T>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }

    @Override
    public T remove() {

        DoublyLinkedNode<T> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();

    }

    @Override
    public T get() {
        return head.get();
    }

}
