import java.util.Scanner;

public class ClaseZero{
    public static void main(String[] args) {

        Scanner es = new Scanner(System.in);

        int opcion=1, opcionI=0;


        while (opcionI==0){

            System.out.println("Hola bienvenido al entregable");
            System.out.println("Presentado por Ronald Tello");

            System.out.println("A continuación escoge el ejercicio que quieres calificar: ");
            System.out.println("1. Convertidor de divisas");
            System.out.println("2. Termometro");
            System.out.println("3. Palindromo");
            opcion = es.nextInt();

            switch (opcion){

                case 1: ConvertidorDivisa objt = new ConvertidorDivisa();
                    objt.funcionalidad();
                    System.out.println("Si desea volver al menú principal teclee 0: ");
                    opcionI = es.nextInt();
                    break;
                case 2:
                    TermoPro ob2 = new TermoPro("Therm Pro", 35);
                    ob2.saludo();
                    System.out.println("Si desea volver al menú principal teclee 0: ");
                    opcionI = es.nextInt();
                    break;
                case 3: Palindromo ob3 = new Palindromo();
                    System.out.println("Bienvenido al detector de palindromos");
                    ob3.pal();
                    System.out.println("Si desea volver al menú principal teclee 0: ");
                    opcionI = es.nextInt();
                    break;
                default:
                    System.out.println("Si desea volver al menú principal teclee 0: ");
                    opcionI = es.nextInt();
            }



        }

        es.close();

    }

}
