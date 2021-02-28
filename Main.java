/***
 * @author Gabriel Vicente & Pedro Arriola
 * Clase Main que tiene el método main que ejecuta el programa
 */
import java.util.Scanner;
import java.io.*;
import java.util.Vector;
public class Main {
    public static  void main(String[] args){
        /***
        *Instancia necesarias para que funcione el mini menu del usuario para saber que forma usar
        */

        Scanner scan = new Scanner(System.in);
        boolean ciclo_main = true;
        String implementation = "";

        System.out.println("\n______________________-----------------------------------______________________");
        System.out.println("______________________----------INFIX Calculadora------" +
                "" +
                "---______________________");
        System.out.println("______________________-----------------------------------______________________\n\n");

        while ( ciclo_main == true) {
            try {
            System.out.println("Elige la implemteacion que utilizaras\n");
            System.out.println("    1. Vector");
            System.out.println("    2. Array List");
            System.out.println("    3. Listas");
            

            int option = Integer.parseInt(scan.nextLine());


            switch (option){

                /**
                 * Opcion 1 Usara Vector para los push y pops
                 */

                case 1: System.out.println("opcion 1\n");
                implementation = "Vector";
                ciclo_main = false;
                break;

                /**
                 * Opcion 2 ArrayList sera la que empleara os Push y Pops
                 */

                case 2: System.out.println("opcion 2\n");
                implementation = "ArrayList";
                ciclo_main = false;
                break;

                /**
                 * Opcion 3 Listas que desplega la opcion de elegir entre Double y una lista normal
                 */

                case 3: System.out.println("opcion 3\n");

                        System.out.println("Elige la implemteacion que utilizaras de listas\n");
                        System.out.println("    1. Simplemente encadenada");
                        System.out.println("    2. Doblemente encadenada");
            

                        int option_listas = Integer.parseInt(scan.nextLine());


                        switch (option_listas){

                            case 1: System.out.println("opcion 1\n");
                            implementation = "Simple";
                            ciclo_main = false;
                            break;

                

                            case 2: System.out.println("opcion 2\n");
                            implementation = "Double";
                            ciclo_main = false;
                            break;
                        }

                break;
            }
            }catch (Exception e){
                System.out.println("opcion no encontrada\n");
            }

        }

        System.out.println(implementation);
        /***
         * Instancias de un calculadora para usar su operacion de calculo
         * Creacion de un vector para guardar todas las operaciones Infix que tenga el .txt
         * Instancia de conver que permite convertir las expresiones Infix a Postfix
         */
        IN conver = new IN(); 
        CalculadoraSingle calc = CalculadoraSingle.getCalculadora();
        Vector <String> varios = new Vector<String>();

        /***
         * try que lee el archivo.txt haciendo que cada linea se agregue al vector a modo de String
         */
        try{
            FileReader r = new FileReader("datos.txt");
            BufferedReader buffer = new BufferedReader(r);

            String temp ="";

            while(temp!=null){
                temp = buffer.readLine();
                if(temp == null){
                    break;
                }
                varios.add(conver.infixToPostfix(temp));

            }
        }catch(Exception e){
            System.out.println("archivo no encontrado");
        }

        /***
         * Segun la cantidad de operaciones Postfix que existan en el vector a cada una se le aplica la operación de
         * calculo de la clase calculadora que devuelve el resultado de la sentencia Postfix y lo imprime al usuario.
         */
        for(int a =0;a<varios.size();a++){
            String num = calc.Calculo(varios.get(a),implementation);
            System.out.println();
            System.out.println(" Resultado operacion "+(a+1));
            System.out.println(num);
            System.out.println();
        }

    }

}
