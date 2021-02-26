/************************************
 * @author Gabriel Vicente 20498 y Pedro Arriola 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * Grupo #11
 ************************************/

public interface List<T>
{

   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements


   public void add(T value);
   // post: value is added to tail of list

   public T remove();
   // pre: list has at least one element
   // post: removes last value found in list

   public T get();
   // pre: list has at least one element
   // post: returns last value found in list

   //public boolean contains(E value);
   // pre: value is not null
   // post: returns true iff list contains an object equal to value

}




