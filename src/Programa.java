import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {        menu();    }

    public static void menu(){
        int opcion=0;
        do{
            mostrarMenu();
            opcion= recibirOpcion();
        } while (opcion!=5);
    }

    public static void mostrarMenu(){
        System.out.println("===Menu===");
        System.out.println("Escoja una de las siguiente opciones:");
        System.out.println("1. Verificar si una frase es revés-derecho");
        System.out.println("2. Contar cuantas vocales tiene una frase");
        System.out.println("3. Encriptar");
        System.out.println("4. Desencriptar");
        System.out.println("5. Salir");
    }

    public static int recibirOpcion(){
         Scanner scan = new Scanner(System.in);
        int opcionRecibida = 0;
             do {
                 try{
                     opcionRecibida = scan.nextInt();} catch (Exception e){
                     System.out.println("Ingrese un número válido");}
             } while ((opcionRecibida > 6) || (opcionRecibida < 1));
         return opcionRecibida;
    }

}
