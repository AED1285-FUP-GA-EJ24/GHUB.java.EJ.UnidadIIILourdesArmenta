package vocal;
//Proposito: convertir un caracter (a,e,i,o,u) en un número
//          a- 1 e-2 i-3 o-4 u-5
//  Autor:Lourdes Armenta
// Fecha:16/abr/24
import java.util.Scanner;
public class Vocal{
    public  void vocal(){
        //Creamos objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //definir variable de entrada
        char voc;
        System.out.print("Introduce una vocal:");
        voc = entrada.next().charAt(0);
        switch (voc) {
            case 'a':
                System.out.println("1");
                break;
            case 'e':
                System.out.println("2");
                break;
            case 'i':
                System.out.println("3");
                break;
            case 'o':
                System.out.println("4");
                break;
            case 'u':
                System.out.println("5");
                break;
        
            default:
                System.out.println("Caracter inválido");
                break;
        }
        //El break, salta a esta linea
        System.out.println("Salí de la sentencia switch");
        entrada.close();


    }
}