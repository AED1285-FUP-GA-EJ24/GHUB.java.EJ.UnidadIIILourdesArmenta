package miPrincipal;


import java.util.Scanner;

import ine.Ine;
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("**************************************");
        System.out.println("            MENU DE OPCIONES          ");
        System.out.println("**************************************");
        System.out.println("* 1) Calcular Edad para INE           ");                
        System.out.println("* 2) Hermano Mayor                    ");
        System.out.println("* 3) Incentivos de Unidades Producidas"); 
        System.out.println("* 4) Determinar mayor de 3 Números    ");
        System.out.println("* 5) Tipo de Triángulo                ");
        System.out.println("* 6) Convertir Arábigo a Romano       ");
        System.out.println("* 7) Convertir Caracter a Vocal       ");
        System.out.println("* 8) Menor, Igual o Mayor de 3        ");
        System.out.println("* 9) Determinar Tipo de Calificación  ");
        System.out.println("*10) Seleccionar Tipo Tarifa          ");
        System.out.println("**************************************");
        System.out.print("Seleccion Opcion:");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
             Ine objIne = new Ine();
             objIne.determinarSiIne();
        }
    }

}