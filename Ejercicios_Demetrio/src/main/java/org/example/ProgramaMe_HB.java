package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Demetrio García Ferre
 * @version 1.0.0
 */
public class ProgramaMe_HB {

    static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        while (casoDePrueba()) {

        }
    }
/**
   caseDePrueba es el método principal dónde se ejecutará nuestro programa, contiene un if(aux) para cortar la ejecución del programa si el valor no cumple las condiciones.
   @return true || false
*/
    public static boolean casoDePrueba() {

            int tiempomax = Tiempo();
            boolean aux = ValidarTiempo(tiempomax);
            if (aux) {
                int[] felicitaciones = cadenaDatos();
                System.out.println(Arrays.toString(felicitaciones));
                int cant = CantFelic(felicitaciones, tiempomax);
                System.out.println(cant);
                return true;
            }
            else {
                return false;
            }
    }

    /**
        En el método Tiempo pedimos al usuario un entero si la entrada de los datos no coincide con la esperada (entero) igualamos la variable tiempomax a 0 (que como veremos más adelnante no es válido)
        si la entrada si és válida retornaremos el valor.
     @return tiempomax
     */
    public static int Tiempo () {
        int tiempomax = 0;
        try {
            tiempomax = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            tiempomax = 0;
        }
        return tiempomax;
    }
    /**
        En el método ValidarTiempo comprobamos que el número introducido cumple las condiciones:
                  >1 && <100001, si esto no se cumple retornamos false de lo contrario true.
        @param tiempo - pedimos un entero (tiempo) el cual recibimos del metodo anterior, este parametro nos indica la cantidad de tiempo maxima que vamos a esperar entre mensajes.
        @return aux
    */
    public static boolean ValidarTiempo(int tiempo) {
        boolean aux;
        aux = tiempo > 0 && tiempo <= 100000;
        return aux;
    }

    /**
        El metodo cadenaDatos nos devolverá un array de enteros, para llegar a esta empezamos por pedir un string con las felicitaciones y lo almacenamos en un array con el metodo split " "
        luego vamos conviertiendo los valores en enteros (siempre que no sean superiores a 10^9) como nuestra cadena acaba en 0 (Porque si no entrará al bucle y acabará ahi el programa)
         cuando el valor del array sea 0 el cual lo ordenará y saldrá del bucle for e ira a otro dónde pasaremos los valores ordenados al segundo array (hay que tener cuidado que al ordenar el primer valor será 0, el cual deberá ir el último)
         para no cometer ese error vamos añadiendo a tiempo2 el valor de tiempo1+1 y cuando llegamos a la ultima posicion ponemos el 0 y devolvemos tiempo2.

     @return tiempo2
    */


    public static int[] cadenaDatos() {
        String felicitaciones;
        int[] tiempo2 = null;
        int[] tiempo = null;
        try {
            felicitaciones = entrada.nextLine();

            String[] tfel = felicitaciones.split(" ");
            tiempo = new int[tfel.length];
            tiempo2 = new int[tiempo.length];

            if (!Objects.equals(tfel[tfel.length - 1], "0")){
                System.exit(0);
            }
            for (int i = 0; i < tfel.length; i++) {

                if (tiempo[i] > 1000000000) {
                    System.out.println("ERROR");
                    System.exit(0);
                }
                if (Objects.equals(tfel[i], "0")) {
                    tiempo[i] = Integer.parseInt(tfel[i]);
                    Arrays.sort(tiempo);
                    break;
                }
                tiempo[i] = Integer.parseInt(tfel[i]);

            }
        } catch (NumberFormatException e) {
            System.exit(0);
        }
        for (int i = 0; i < tiempo2.length; i++) {

            if (i == tiempo2.length - 1) {
                tiempo2[i] = 0;
            } else {
                tiempo2[i] = tiempo[i + 1];
            }
        }
        return tiempo2;
    }

    /**
        Por último el metodo CantFelic nos devolvera cuantas veces tenemos que felicitar para realizar este calculo realizamos un bucle dónde vamos pasando por los números del array si el tiempomax es mayor que las respuestas pasará a la siguiente posición del array hasta que sea menor, añadimos una respuesta
        y seguiremos recorriendo hasta que se terminen los valores del array.
     @param datos - necesitaremos el array de datos de los tiempos que hemos recibido los mensajes (tiempo2).
     @param tiempo - el intevalo max (tiempo max) que va ser quien nos indica cada cuanto vamos a "escrbir un mensaje".
     @return respuestas
     */
    public static int CantFelic(int [] datos, int tiempo){

        int respuestas = 0;
        int tiempot = 0;

        for (int i = 0; i < datos.length-1; i++) {
            int tmsg = datos[i];

            if (tmsg<=tiempot){

            }else {
                respuestas++;
                i--;
                tiempot=tiempot+tiempo;
            }
        }

        return respuestas;
    }
}

