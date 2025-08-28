import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TeatroManager {
    
    // Método para ordenar asientos por fila y precio
    public static void ordenarAsientosPorFilaYPrecio(Asiento[][] teatro) {
        for (int i = 0; i < teatro.length; i++) {
            Arrays.sort(teatro[i], new Comparator<Asiento>() {
                @Override
                public int compare(Asiento a1, Asiento a2) {
                    return Double.compare(a1.getPrecio(), a2.getPrecio());
                }
            });
        }
    }
    
    // Método para ingresar datos del teatro
    public static Asiento[][] ingresarDatosTeatro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== INGRESO DE DATOS DEL TEATRO ===");
        
        // Pedir dimensiones del teatro
        System.out.print("Ingrese número de filas: ");
        int filas = scanner.nextInt();
        
        System.out.print("Ingrese número de asientos por fila: ");
        int asientosPorFila = scanner.nextInt();
        
        // Crear matriz de teatro
        Asiento[][] teatro = new Asiento[filas][asientosPorFila];
        
        // Ingresar datos de cada asiento
        for (int i = 0; i < filas; i++) {
            System.out.println("\n--- Fila " + (i + 1) + " ---");
            for (int j = 0; j < asientosPorFila; j++) {
                System.out.println("Asiento " + (j + 1));
                
                System.out.print("  Precio: ");
                double precio = scanner.nextDouble();
                
                // Crear asiento (número automático, fila automática)
                teatro[i][j] = new Asiento(j + 1, i + 1, precio);
            }
        }
        
        return teatro;
    }
    
    // Método para mostrar el teatro
    public static void mostrarTeatro(Asiento[][] teatro) {
        System.out.println("\n=== DISTRIBUCIÓN DEL TEATRO ===");
        for (int i = 0; i < teatro.length; i++) {
            System.out.println("\nFila " + (i + 1) + ":");
            for (int j = 0; j < teatro[i].length; j++) {
                if (teatro[i][j] != null) {
                    System.out.println("  " + teatro[i][j]);
                }
            }
        }
    }
} 
