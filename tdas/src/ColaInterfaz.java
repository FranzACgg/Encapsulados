public interface ColaInterfaz {
    //InicializarCola, Acolar, Desacolar, Primero y ColaVacia.

    void InicializarCola();
    void Acolar(int elemento);
    void Desacolar();
    int Primero();
    boolean ColaVacia();
}
