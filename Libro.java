import java.util.Scanner;

public class Libro {

    String Titulo, Autor;
    int precio;
    Scanner sc = new Scanner(System.in);
    

    public Libro libroMasCaro(Libro[][] libros){

        Libro libroMasCaro = libros [0][0];

        for (int i = 0; i < libros.length; i++) {
            for (int j = 0; j < libros[i].length; j++) {
                if (libros[i][j].precio > libroMasCaro.precio) {
                     
                    libroMasCaro = libros[i][j];
                    
                }
            }
            
        }
        return libroMasCaro;

    }
}
