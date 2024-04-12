package mayor;

import java.util.Scanner;

public class Mayor2{
    public void mayor(){
        //declarar el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //Variables de salida
        //Variables de entrada
        int a,b,c ;
        System.out.println("Proporciona los valor de a,b y c:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        if (a>b && a>c)
            System.out.println("El mayor es: "+a);
        
        if(b>a && b>c){
            System.out.println("El mayor es: "+b);
        }
        if (c>a && c>b){
            System.out.println("El mayor es: "+c);
        }
        entrada.close();
        


    }
}
