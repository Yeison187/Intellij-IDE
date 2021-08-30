import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        String nombre = "";
        String celular = "";
        String edad = "";
        System.out.print("Digite su nombre: ");
        nombre = entradaTeclado.nextLine();

        while (nombre.length() < 3 || !isValidName(nombre)) {
            System.out.print("Digite un nombre valido: ");
            nombre = entradaTeclado.nextLine();
        }

        System.out.print("Digite su celular: ");
        celular = entradaTeclado.nextLine();

        while (!isNumeric(removeSpace(celular)) || removeSpace(celular).length() != 10) {

            System.out.print("Numero no valido, digite nuevamente su celular: ");
            celular = entradaTeclado.nextLine();
        }

        System.out.print("Digite su edad: ");
        edad = entradaTeclado.nextLine();

        while (!isNumeric(removeSpace(edad)) || !validAge(removeSpace(edad))) {

            System.out.print("Edad no valida, digite nuevamente su edad: ");
            edad = entradaTeclado.nextLine();
        }


        System.out.println("Bienvenido señor " + nombre + ", es un placer para nosotros contar con una persona de "
                + removeSpace(edad) + " años.\n" + "\n" +
                "Próximamente nos comunicaremos con usted al numero " + removeSpace(celular) + " .\n" +
                "\n" +
                "Feliz día");

    }

    private static boolean isNumeric(String cadena) {
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean validAge(String cadena) {

        if (Integer.parseInt(cadena) >= 18 && Integer.parseInt(cadena) <= 80) {

            return true;

        } else {
            
            System.out.println("Recuerda que buscamos personas entre 18 y 80 años");
            return false;
        }

    }

    private static String removeSpace(String cadena) {
        return cadena.replace(" ", "");
    }

    private static boolean isValidName(String cadena) {
        char caracter;
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (!((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z') || caracter == ' ')) {
                return false;
            }
        }
        return true;
    }


}
