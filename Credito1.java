
import java.io.*;
import java.*;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a description of class Credito1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credito1
{
    // instance variables - replace the example below with your own

   public static void inicio()
    {
       int valorCredito = leerEntero("Valor del crédito");
       int numeroCuotas = leerEntero("Número de cuotas");
       double tasaInteres = leerDecimal("Tasa de interes");
       double i = tasaInteres/100;
       double valorCuota = valorCredito*((i)/(1-Math.pow(1+i,-numeroCuotas)));
       double deuda =  valorCredito;
       
       System.out.println("cuota_Pago_Interes_Amortización_Saldo");
       System.out.println("0"+valorCredito);
       
      for(int j=1; j<=numeroCuotas; j++){
       double interes = deuda* (i);
       double amortización =  (valorCuota - interes);
       deuda = deuda - amortización;
       
       DecimalFormat df = new DecimalFormat("#.##");
       System.out.println(j+"______"+df.format(valorCuota)+"______"+df.format(interes)+"______"+df.format(amortización)+"______"+df.format(deuda));       
       }
    }
    public static double leerDecimal(String texto){
         Scanner scanner = new Scanner(System.in);
         System.out.println(texto);
         return scanner.nextDouble();
    }
     public static int leerEntero(String texto){
         Scanner scanner = new Scanner(System.in);
        System.out.println(texto);
        return scanner.nextInt();
    }
    
}