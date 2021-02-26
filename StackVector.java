/************************************
 * @author Gabriel Vicente 20498 y Pedro Arriola 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * Grupo #11
 ************************************/

import java.util.EmptyStackException;
import java.util.Vector;

public class StackVector<T> implements Stack<T> {

    protected Vector<T> data;

    public StackVector() {
        // Se crea un stack vacio.
        data = new Vector<T>();
    }

    // Sobrecarga de StackVector para que acepte un tamaño definido.
    public StackVector(int size) {
        // Se crea un stack vacio con la cantidad que se quiera definir.
        data = new Vector<T>(size);
    }


    /**
     * Pre: Se ingresa dato.
     * @param item recibe dato para ingresar al stack.
     * Post: Se almacena en Stack.
     */
    @Override
    public void push(T item) {
        data.add(item);
    }


    /**
     * Pre:Indice - 1 para el dato en Stack.
     * @return E cualquier tipo de dato.
     * Post:Regresa el dato eliminado.
     */
    @Override
    public T pop() {

        return data.remove(size() - 1);
    }


    /**
     * Pre: Revisa el valor mas cercano.
     * @return E valor deseado.
     * @throws EmptyStackException
     * Post: Devuelve el valor inmediato del stack.
     */
    @Override
    public T peek() throws EmptyStackException {
        if(data.isEmpty()){
            throw new EmptyStackException();
        }

        return data.elementAt(data.size()-1);
    }


    /**
     * Pre: Verifica si el stack esta vacio.
     * @return boolean
     * Post: Regresa falso si no esta vacio, verdadero si esta vacio.
     */
    @Override
    public boolean empty() {

        return data.isEmpty();
    }


    /**
     * Pre: Analiza el stack.
     * @return int
     * Post: Devuelve el tamaño del stack.
     */
    @Override
    public int size() {

        return data.size();
    }

}
