public class objPunto2 {
    private String Nombre_Producto;
    private int Cantidad_Producto;


    public objPunto2(String nombre_producto, int cantidad_producto) {
        this.Nombre_Producto = nombre_producto;
        this.Cantidad_Producto = cantidad_producto;
    }

    public objPunto2() {
        
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        Nombre_Producto = nombre_Producto;
    }

    public int getCantidad_Producto() {
        return Cantidad_Producto;
    }

    public void setCantidad_Producto(int cantidad_Producto) {
        Cantidad_Producto = cantidad_Producto;
    }



}
