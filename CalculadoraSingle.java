/****
* Implementacion de patron de diseño Single, que devuelve la única instancia de calculara
****/

public class CalculadoraSingle{
    
    Calculadora calculator ;
    private static CalculadoraSingle calculators = null; 
    private CalculadoraSingle() 
    { 
        calculator = new Calculadora();
    } 
    public String Calculo(String frase,String uso){

        return calculator.Calculo(frase,uso);
    }
  
    public static CalculadoraSingle getCalculadora() { 
        if (calculators == null) 
            calculators = new CalculadoraSingle(); 
  
        return calculators; 
    } 
}
