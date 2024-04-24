package demoFor;
/*
 * Proposito: Demostracion del uso de for
 * Sintaxis:
 * for(Inicializacion;CondicionIteracion;Incremento)
 *      Sentencias;
 * 
 * Inicializacion: inicializa la variable de control
 * Condición de iteracion: EXPRESION LOGICA, que determina
 *     que las sentencias se ejecutan mientras sea verdadera
 * Incremento: Incrementa o decrementa la variable de control
 * Sentencias: Sentencias a ejecutar en cada iteracion
 * 
 */

public class DemoFor {
    public void demofor(){
        //Defino variable de control
        int i;
        System.out.println("Ejemplos de ciclos Ascendentes:");
        //ciclo con incrementos de 1
        for(i=1;i<=10;i++){// i = i+1
            System.out.print("i="+i+" Hola"+"\n");

        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        //ciclos con incremento de 2
        for(i=1;i<=10;i += 2){//i = i+2;
            System.out.print("i="+i+" Hola"+"\n");
        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        System.out.println("Ejemplos de ciclos Descendentes:");
        for(i=10;i>0;i--){ // i = i-1
            System.out.print("i="+i+" Hola"+"\n");
        }
        System.out.println("Sali del buclo y la variable de control i = "+i);
        for(i=10;i>0;i-=2){ // i=i-2
            System.out.print("i="+i+" Hola"+"\n");
        }


    }
    
}
