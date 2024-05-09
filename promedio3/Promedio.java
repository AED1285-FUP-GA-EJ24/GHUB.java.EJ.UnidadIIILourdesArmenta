package promedio3;
/*
 * Cuando no se conoce cuántos elementos de datos se procesarán antes de 
 * comenzar la ejución ya sea porque hay muchos que contar o porque el número
 * de datos depende de la secuencia del proceso de cálculo, se puede manejar esta situación 
 * dado un dato único y especidico denominado VALOR CENTINELA, la condición del bucle 
 * terminará cuando se introduca el valor centinelada pactado.
 */

import java.util.Scanner;
/*
 * Proposito: Leer calificaciones mediante la técnica de centinela
 * que cuando en la calificacion teclee -1 indique que ya no hay calificaciones
 * por leer
 */
public class Promedio {
    public void promedio(){
         //objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        float r;
        //variable de entrada
        int n;
        //variables auxiliares
        final int CENTINELA = -1;
        int acum_calf=0,cuenta=0;
        System.out.print("Introduzca la primera calificación (-1 para terminar): ");
        n = teclado.nextInt();
        while (n !=CENTINELA){
            cuenta++;
            acum_calf += n;
            System.out.print("Proporciona SIGUIENTE calificaión "+
                            cuenta+" (-1 para Terminar):");
            n = teclado.nextInt(); 
        }
        r = (float)acum_calf/cuenta;
        System.out.println("Promedio = "+r);
        teclado.close();
    }
    
}
