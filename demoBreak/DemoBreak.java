package demoBreak;
//propósito: uso de las sentencias break y continue

public class DemoBreak {
    public void demoBreak(){
        System.out.println("uso de la sentencia for");
        for(int j=1; j<=5;j++){
            System.out.println("Hola");
            if (j==3)
              break; //no toma en cuenta la condición de parada del bucle 
                     //y aborta el ciclo mas interno;
        }

        System.out.println("uso de la sentencia while");
        int j=1;
        while(j<=5){
           
            
            System.out.println("Hola");
            j++;
            break; // solo imprime una vez la palabra hola
            

        }
        System.out.println("uso de la sentencia do..while");
        j=1;
        do{
            System.out.println("Hola");
            j++;

        } while (j<=5);
        //uso de continue;
        System.out.println("uso continue");
        for(j=1; j<=5;j++){
            
            if (j==3){
              continue; //no toma en cuenta la condición de parada del bucle 
                      //y aborta el ciclo mas interno;
            }
            System.out.println("Hola");
        }
        
    }
    
    

    
}
