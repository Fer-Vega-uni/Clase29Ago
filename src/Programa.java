public class Programa {

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
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");

    }

}
