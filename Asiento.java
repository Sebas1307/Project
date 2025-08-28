public class Asiento {
    private int numero;
    private int fila;
    private double precio;
    
    // Constructor
    public Asiento(int numero, int fila, double precio) {
        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
    }
    
    // Getters
    public int getNumero() { return numero; }
    public int getFila() { return fila; }
    public double getPrecio() { return precio; }
    
    // Setters
    public void setNumero(int numero) { this.numero = numero; }
    public void setFila(int fila) { this.fila = fila; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    @Override
    public String toString() {
        return String.format("Asiento %d (Fila %d) - $%.2f", numero, fila, precio);
    }
}