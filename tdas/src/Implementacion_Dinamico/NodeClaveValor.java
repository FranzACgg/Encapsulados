package Implementacion_Dinamico;

public class NodeClaveValor {

    private int clave;
    private int valor;
    private NodeClaveValor next;

    public NodeClaveValor(int clave, int valor, NodeClaveValor next) {
        this.clave = clave;
        this.valor = valor;
        this.next = next;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodeClaveValor getNext() {
        return next;
    }

    public void setNext(NodeClaveValor next) {
        this.next = next;
    }
}
