/**
 * @author Pedro Arriola
 * Carnet 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PruebasUnitariasLinkedLists {


    StackSinglyLinkedList<String> stackSingly = new StackSinglyLinkedList<String>();

    StackDoublyLinkedList<String> stackDoubly = new StackDoublyLinkedList<String>();


    @Test
    public void pruebaPopSingly(){

        stackSingly.push("hola");
        assertEquals("hola", stackSingly.pop());

    }

    @Test
    public void pruebaPeekSingly(){
        stackSingly.push("hola");
        stackSingly.push("hello");
        assertEquals("hola", stackSingly.peek());
    }


    @Test
    public void pruebaEmptySingly(){

        assertEquals(true, stackSingly.empty());

        stackSingly.push("2");

        assertEquals(false, stackSingly.empty());
    }

    @Test
    public void pruebaSizeSingly(){
        stackSingly.push("hola");
        stackSingly.push("hello");
        assertEquals(2, stackSingly.size());
    }

    @Test
    public void pruebaPopDoubly(){

        stackDoubly.push("hola");
        assertEquals("hola", stackDoubly.pop());

    }


    @Test
    public void pruebaEmptyDoubly(){

        assertEquals(true, stackDoubly.empty());

        stackDoubly.push("2");

        assertEquals(false, stackDoubly.empty());
    }

    @Test
    public void pruebaSizeDoubly(){
        stackDoubly.push("hola");
        stackDoubly.push("hello");
        assertEquals(2, stackDoubly.size());
    }
}

