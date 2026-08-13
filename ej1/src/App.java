/*
Código del producto.
Nombre del producto.
Precio unitario.
Cantidad en stock.
a) Definir la clase Producto con estos atributos.
b) Definir un constructor que reciba por parámetro el código, el nombre y
el precio, e inicialice la cantidad en stock en cero.
c) Definir un método mostrarDatos() que imprima por pantalla los valores
de todos los atributos del producto.
d) Escribir un programa principal (main) que cree dos productos y
muestre sus datos por pantalla.

Ampliar la clase Producto del ejercicio anterior:
a) Agregar un método consultarStock() que devuelva la cantidad actual en
stock.
b) Agregar un método ingresarStock(cantidad) que aumente la cantidad
en stock en el valor indicado (por ejemplo, cuando llega mercadería del
proveedor).
c) Desde el programa principal, ingresar stock a un producto un par de
veces y mostrar la cantidad resultante consultando el stock.

Ampliar nuevamente la clase Producto:
a) Agregar un método venderProducto(cantidad) que disminuya la
cantidad en stock en el valor indicado, simulando una venta.
b) Tener en cuenta que no se puede vender una cantidad mayor a la que
hay en stock: si esto ocurre, el método no debe modificar el stock y debe
informar por pantalla que no hay stock suficiente.
c) Desde el programa principal, probar el método venderProducto() con
una venta válida y con una venta que supere el stock disponible,
verificando que el comportamiento sea el esperado en ambos casos.
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Producto producto1 = new Producto("123", "coca", 2.5f);
        Producto producto2 = new Producto("321", "pepsi", 2);
        producto1.mostrarDatos();
        producto2.mostrarDatos();
        producto1.ingresarStock(2);
        producto1.ingresarStock(4);
        System.out.println(producto1.consultarStock());
        producto1.venderProducto(10);
        producto1.venderProducto(3);
        producto1.mostrarDatos();
    }
}
