public class Producto {
    private String codigo;
    private String producto;
    private float precio;
    private int stock;

    public Producto(String codigo, String producto, float precio) {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
        this.stock = 0;
    }

    public void mostrarDatos() {
        System.out.println("codigo: " + codigo + " - " + 
                        "producto: " + producto + " - " + 
                        "precio: $" + precio + " - " + 
                        "stock: " + stock);
    }
    public int consultarStock() {
        return stock;
    }
    public void ingresarStock(int cantidad) {
        stock += cantidad;
    }
    public void venderProducto(int cantidad) {
        if (stock - cantidad >= 0) {
            stock -= cantidad;
            System.out.println("Venta exitosa!");
        }
        else {
            System.out.println("No se pudo realizar venta; Stock es menor al solicitado");
        }

    }
}
