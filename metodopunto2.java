import java.util.Scanner;

public class metodopunto2 {
    public objPunto2[][] Llenar_Matriz_punto2(objPunto2[][] m){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objPunto2 o2 = new objPunto2();
                System.out.println("Ingrese el nombre del producto:");
                o2.setNombre_Producto(sc.nextLine());
                System.out.println("Ingrese la cantidad del producto:");
                o2.setCantidad_Producto(sc.nextInt());
                sc.nextLine();  // Limpiar el buffer
                m[i][j] = o2;
            }
        }
        return m;
    }

    public void Mostrar_Matriz_punto2(objPunto2[][] m){
        int totalCantidad = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre del Producto: " + m[i][j].getNombre_Producto());
                System.out.println("Cantidad del Producto: " + m[i][j].getCantidad_Producto());
                System.out.println("-----------------------------");
                totalCantidad += m[i][j].getCantidad_Producto();
            }
            System.out.println();
            System.out.println("Total Cantidad de Productos: " + totalCantidad);
        }
    }




}
