import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        String nombre="";
        String celular="";
        byte edad=0;
        System.out.println("Digite su nombre");
        nombre=entradaTeclado.nextLine();
        System.out.println("Digite su celular");
        celular=entradaTeclado.nextLine();
        System.out.println("Digite su edad");
        edad=entradaTeclado.nextByte();


        System.out.println("Bienvenido señor "+nombre+", es un placer para nosotros contar con una persona de "+edad+" años.\n"+
                "\n"+
                "Próximamente nos comunicaremos con usted al numero "+celular+" .\n"+
                "\n"+
                "Feliz día");
    }
}
