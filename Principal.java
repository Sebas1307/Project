import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SISTEMA DE ORDENAMIENTO DE ASIENTOS DE TEATRO");
        System.out.println("=============================================");
        
        // Ingresar datos del teatro
        Asiento[][] teatro = TeatroManager.ingresarDatosTeatro();
        
        // Mostrar teatro antes de ordenar
        System.out.println("\nANTES del ordenamiento:");
        TeatroManager.mostrarTeatro(teatro);
        
        // Preguntar si quiere ordenar
        System.out.print("\n¿Desea ordenar los asientos por precio? (s/n): ");
        String respuesta = scanner.next();
        
        if (respuesta.equalsIgnoreCase("s")) {
            // Ordenar el teatro
            TeatroManager.ordenarAsientosPorFilaYPrecio(teatro);
            
            // Mostrar resultado después de ordenar
            System.out.println("\nDESPUÉS del ordenamiento:");
            TeatroManager.mostrarTeatro(teatro);
        } else {
            System.out.println("Operación cancelada.");
        }
        
        System.out.println("\n¡Gracias por usar el sistema!");
        scanner.close();
    }
}
