public interface colaInterfaz {
    //InicializarCola, Acolar, Desacolar, Primero y ColaVacia.

    void iniciarCola(int tamanio);
    void acolar(int elemento);
    void desacolar();
    int primero();
    boolean colaVacia();
}
