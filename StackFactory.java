/***
* fabrica que returna la implementacion según lo solicite la calculadora
***/
public class StackFactory {
    
    /** 
     * @param dato
     * @return MenuGeneral
     */
    public Stack implementacion(String lista){
        
        if(lista.equals("Vector")){
            return new StackArrayList<Integer>();
        }else if(lista.equals("ArrayList")){
            return new StackVector<Integer>();
            /**
            *version con implementacion de listas
            */
        }else if(lista.equals("Simple")){
            return new StackSinglyLinkedList<Integer>();
           
        }else if(lista.equals("Double")){
             return new StackDoublyLinkedList<Integer>();
        }
        return null;
    }
}