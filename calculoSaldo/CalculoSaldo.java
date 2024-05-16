package calculoSaldo;
//proposito: calcular el saldo

public class CalculoSaldo {
    public void calculoSaldo(){
        int anyos=0;
        double saldo=0, pago=10000;
        float tasaInteres = 7.5f;
        double limite = 2000000;
        
        while(anyos<=50){
            saldo = saldo + pago;
            double interes = saldo * tasaInteres/100;
            saldo = saldo + interes;
            if (saldo>=limite)
               break;
            anyos++;

        }
        System.out.println("En "+ anyos+" usted obtuvo con una tasa de "+tasaInteres+ " "+saldo);

    }
    
}
