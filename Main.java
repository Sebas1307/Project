
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sitema necesitado: '1', '2', '3' o '4' o presione '0' para terminar: ");
        int opc = sc.nextInt();

        while (opc != 0) {
            switch (opc) {
                case 1:
                    System.out.println("Sistema 1");
                    break;
                case 2:
                    System.out.println("Sistema 2");
                    break;
                case 3:
                    System.out.println("Sistema 3");
                    break;
                case 4:
                    System.out.println("Sistema 4");
                    break;
                default:
                    System.out.println("Ingrese un sistema valido: '1', '2', '3' o '4'");
            }
            System.out.println("Ingrese sitema necesitado: '1', '2', '3' o '4' o presione '0' para terminar: ");
            opc = sc.nextInt();
        }
    }
}
