package menorde3;
//Proposito:Leer un número y determinar
//      si es Menor que 3, igual a 3 o
//      mayor que 3
import java.util.Scanner;
public class Menorde3 {
    public void menorde3(){
        //declaracion del objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //variable de entrada
        int num;
        System.out.print("Proporciona un número entero:");
        num=entrada.nextInt();
        if (num<3){
            System.out.println("Menor de 3!");
        }
        else if(num==3){
            System.out.println("Igual a 3");
        }
        else{
            System.out.println("Mayor que 3!");
        }
        /* 
        switch (num) {
            case 0:
            case 1:
            case 2:
                System.out.println("Menor que 3");
                break;
            case 3:
                 System.out.println("Igual a 3!");
                 break;
            default:
                System.out.println("Mayor que 3!");
                break;
        }
        */
        entrada.close();


    }
    
}
