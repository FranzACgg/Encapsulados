public class Cuenta {
    private String nombres;
    private String apellidos;
    private String numeroCuenta;
    private boolean esAhorro;
    private int saldo;

    public Cuenta(String nombres, String apellidos, String numeroCuenta, boolean esAhorro) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.esAhorro = esAhorro;
        this.saldo = 0;
    }

    public void imprimirDatos() {
        System.out.println("Nombres del titular: " + nombres);
        System.out.println("Apellidos del titular: " + apellidos);
        System.out.println("Número de cuenta: " + numeroCuenta);
        if (esAhorro) {
            System.out.println("Tipo de caja: Ahorro");
        }
        else {
            System.out.println("Tipo de caja: Corriente");
        }
        System.out.println("Saldo: $" + saldo);
    }
    public void consultarSaldo() {
        System.out.println("Saldo: $" + saldo);
    }
    public void actualizarSaldo(int cantidad) {
        saldo += cantidad;
    }
    public void retirarDinero(int cantidad) {
        if (saldo - cantidad >= 0) {
            saldo -= cantidad;
            System.out.println("Operación exitosa");
        }
        else {
            System.out.println("Operación fallida, la cantidad retirada es mayor al saldo");
        }
    }
}
