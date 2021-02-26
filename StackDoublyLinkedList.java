/************************************
 * @author Gabriel Vicente 20498 y Pedro Arriola 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * Grupo #11
 ************************************/

public class StackDoublyLinkedList<T> implements Stack<T> {


    private DoublyLinkedList<T> data;

    public StackDoublyLinkedList(){
        data = new DoublyLinkedList<T>();
    }


    /**
     * @param num
     */
    @Override
	public void push(T num) {
        data.add(num);

	}


    /**
     * @return boolean
     */
    @Override
	public boolean empty() {

		return data.isEmpty();
	}


    /**
     * @return int
     */
    @Override
	public int size() {

		return data.size();
	}


    /**
     * @return T
     */
    @Override
	public T pop() {

		return data.remove();
	}


    /**
     * @return T
     */
    @Override
	public T peek() {

		return data.get();
	}


}
