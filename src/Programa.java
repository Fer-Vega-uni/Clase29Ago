import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {        menu();    }

    public static void menu(){
        int opcion;
        do{
            mostrarMenu();
            opcion= recibirOpcion();
            ejecutarOpcion(opcion);
        } while (opcion!=5);
        System.out.println("Saliendo....");
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

    public static void ejecutarOpcion(int opcion){
        switch (opcion){
            case 1: mostrarResultRevesDer(verificarRevesDerecho());
            case 2: contarVocales();
            case 3: encriptarTexto();
            case 4: desencriptarTexto();
        }
    }

    public static String recibirString(){
        Scanner scan = new Scanner(System.in);
        String string = "";
        boolean valid =false;
        do {
            try {
                string = scan.next();
                valid=true;
            } catch (Exception e) {
               System.out.println("Texto no aceptado, intente nuevamente");
            }
            }while (!valid);

        return string;
    }

    public static boolean verificarRevesDerecho(){
        String string= recibirString();
        String[] s=;
        boolean valid;
        for (int i=0; i<s.length;i++){
            if (s[i].equals(s[(s.length - 1) - i])){
                continue;
            } return false;
        }
        return true;
    }

    public static void mostrarResultRevesDer(boolean valido){
        if (valido == true){

        }
    }

    public static void contarVocales(){
        String string= recibirString();

    }

    public static void encriptarTexto(){
        String string= recibirString();
    }

    public static void desencriptarTexto(){
        String string= recibirString();
    }
}
