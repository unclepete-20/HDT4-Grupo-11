/************************************
 * @author Gabriel Vicente 20498 y Pedro Arriola 20188
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * Grupo #11
 ************************************/

public abstract class AbstractList<T> implements List<T>
{
   public AbstractList()
   // post: does nothing
   {
   }


   /**
    * @return boolean
    */
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
}