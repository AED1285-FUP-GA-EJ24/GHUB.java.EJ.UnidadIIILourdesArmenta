package incentivo;
/*
 * Proposito:Determinar si un trabajador recibira
 *        incentivo, siempre y cuando produzca mas
 *        de 100 unidades semanales
 * Autor: Lourdes Armenta
 * Fecha: 10/abril/24
 */
import java.util.Scanner;

public class Incentivo {
    public void incentivo(){
        //crear objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //defino variable de salida
        boolean tiene_incentivo;
        //definir variable de entrada
        short unidades;
        System.out.print("Proporcione unidades semanales producidas:");
        unidades  = teclado.nextShort();
        if (unidades>100){
            tiene_incentivo = true;
        }
        else{
            tiene_incentivo = false;
        }
        System.out.println("Tiene incentivo "+tiene_incentivo);
        teclado.close();

    }
    
}
