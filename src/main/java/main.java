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

        while (nombre.length() < 3 ){
            System.out.println("Digite un nombre valido: ");
            nombre = entradaTeclado.nextLine();
        }

        System.out.println("Digite su celular: ");
        celular = entradaTeclado.nextLine();

        while (!isNumeric(celular.replace(" ","")) || celular.replace(" ","").length() != 10) {

            System.out.println("Numero no valido, digite nuevamente su celular: ");
            celular = entradaTeclado.nextLine();
        }

        System.out.println("Digite su edad: ");
        edad = entradaTeclado.nextLine();

        while (!isNumeric(edad.replace(" ","")) || !validAge(edad.replace(" ",""))) {

            System.out.println("Edad no valida, digite nuevamente su edad: ");
            edad = entradaTeclado.nextLine();
        }


        System.out.println("Bienvenido señor " + nombre + ", es un placer para nosotros contar con una persona de "
                + edad.replace(" ","") + " años.\n" + "\n" +
                "Próximamente nos comunicaremos con usted al numero " + celular + " .\n" +
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

            if (Integer.parseInt(cadena) >= 18 && Integer.parseInt(cadena) < 80){
                return true;
            } else {
                return false;
            }

    }


}
