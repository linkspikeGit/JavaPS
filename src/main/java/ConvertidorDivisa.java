import java.util.Scanner;

public class ConvertidorDivisa {

    Double pesos, valorCambio, dolares;

    public ConvertidorDivisa(){



    }

    public void funcionalidad(){

        Scanner Escan = new Scanner(System.in);
        System.out.println("Bienvenido al convertidor de divisas");
        System.out.println("Ingrese el valor de la moneda en pesos: ");

        pesos= Escan.nextDouble();

        System.out.println("Ingrese el valor del dolar actualmente: ");

        valorCambio = Escan.nextDouble();

        dolares=pesos/valorCambio;

        System.out.println("El valor actual de los $"+pesos+" pesos ingresados es: "+dolares+" dolares");

        Escan.close();


    }





}
