import java.util.Scanner;

public class Palindromo {

    public void pal(){

        Scanner scanner = new Scanner(System.in);
        String frase = "";
        String fDepurada = "";

        int index = 0;
        int indexO = 0;
        int estado = 0;

        System.out.println("Escriba frase");
        frase = scanner.nextLine();

        // Eliminar los espacios de la frase
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                fDepurada += frase.charAt(i);
            }
        }

        if (fDepurada.length() % 2 == 0) {
            index = fDepurada.length();

            for (int j = 0; j < fDepurada.length() / 2; j++) {
                if (fDepurada.charAt(j) == fDepurada.charAt(index - 1)) {
                    estado = 1;
                    index--;
                } else {
                    estado = 0;
                    break;
                }
            }

            if (estado == 1) {
                System.out.println("Esta frase o palabra: (" + fDepurada + ") es un Palindromo");
            } else {
                System.out.println("Esta frase o palabra: (" + fDepurada + ") no es un Palindromo");
            }
        } else {
            index = fDepurada.length() / 2;
            indexO = fDepurada.length();

            for (int j = 0; j < index; j++) {
                if (fDepurada.charAt(j) == fDepurada.charAt(indexO - 1)) {
                    estado = 1;
                    indexO--;
                } else {
                    estado = 0;
                    break;
                }
            }

            if (estado == 1) {
                System.out.println("Esta frase o palabra: (" + fDepurada + ") es un Palindromo");
            } else {
                System.out.println("Esta frase o palabra: (" + fDepurada + ") no es un Palindromo");
            }
        }
        scanner.close();

    }


}
