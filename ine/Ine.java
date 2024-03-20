package ine;
// si un mexicano puede o no tramitar su credencial de elector
// Autor: Lourdes Armenta
// Fecha: 19 de marzo 2024
import java.util.Scanner;
public class Ine{
    public void determinarSiIne(){
        //definir un objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //definir variable de salida
        String resultado;
        //definir variable de entrada
        int anioActual,anioNacimiento;
        //definir variable auxiliar
        int anios;

        System.out.print("Proporciona Año Actual: ");
        anioActual = teclado.nextInt();
        System.out.print("Proporciona Año de Nacimiento:");
        anioNacimiento = teclado.nextInt();

        anios = anioActual - anioNacimiento;

        if(anios>=18)
            resultado = "Usted puede tramitar su INE";
        
        else
            resultado = "Usted NO PUEDS tramitar su INE";
        
        System.out.println(resultado);
        


    }

}