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
            case 2: mostrarResultContV(contarVocales());
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
               System.out.println("Texto no aceptado, intente nuevamente");}
            } while (!valid);
        return string;
    }

    public static boolean verificarRevesDerecho(){
        String string= recibirString();
        char[] s= string.toLowerCase().toCharArray();
        for (int i=0; i<s.length;i++){
            if (s[i]!=(s[(s.length - 1) - i]))
            {return false;}
        }
        return true;
    }

    public static void mostrarResultRevesDer(boolean valido){
        if (valido) System.out.println("Tu frase es Revés derecho");
        else System.out.println("Tu frase no es Revés derecho");
    }

    public static int contarVocales(){
        String string= recibirString();
        char[] s= string.toLowerCase().toCharArray();
        int contador=0;
        for (char c : s) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }}
        return contador;
    }

    public static void mostrarResultContV(int contador){
        if (contador ==0) System.out.println("No hay vocales en tu string");
        else System.out.println("Tu string tiene " + contador+ " vocales");
    }

    public static void encriptarTexto(){
        String string= recibirString();
        char[] s= string.toLowerCase().toCharArray();
        for (int c=0; c<s.length;c++) {
            switch (c){
                case 'a': s[c]= '@';
                case 'e': s[c]= '&';
                case 'i': s[c]= '!';
                case 'o': s[c]= '*';
                case 'u': s[c]= '#';
            }
        }
        System.out.println("Tu string encriptada es: ");
        for (char c : s) System.out.print(c);
        System.out.println();
    }

    public static void desencriptarTexto(){
        String string= recibirString();
        char[] s= string.toLowerCase().toCharArray();
        for (int c=0; c<s.length;c++) {
            switch (c){
                case '@': s[c]= 'a';
                case '&': s[c]= 'e';
                case '!': s[c]= 'i';
                case '*': s[c]= 'o';
                case '#': s[c]= 'u';
            }
        }
        System.out.println("Tu string desencriptada es: ");
        for (char c : s) System.out.print(c);
        System.out.println();
    }
}
