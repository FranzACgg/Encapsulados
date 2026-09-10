package Implementacion_Dinamico;

import Interfaces.DiccionarioSimpleTDA;

public class DiccionarioSimpleDinamico implements DiccionarioSimpleTDA {

    private NodeClaveValor cabeza; // lista enlazada de pares clave-valor

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(int clave, int valor) {
        NodeClaveValor curr = cabeza;

        // Si la clave ya existe, actualiza su valor.
        while (curr != null && curr.getClave() != clave) {
            curr = curr.getNext();
        }

        if (curr != null) {
            curr.setValor(valor);
        } else {
            cabeza = new NodeClaveValor(clave, valor, cabeza);
        }
    }

    @Override
    public void Eliminar(int clave) {
        NodeClaveValor curr = cabeza;
        NodeClaveValor prev = null;

        while (curr != null && curr.getClave() != clave) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                cabeza = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        }
    }

    @Override
    public int[] Claves() {
        int count = 0;
        NodeClaveValor curr = cabeza;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        int[] result = new int[count];
        curr = cabeza;
        for (int i = 0; i < count; i++) {
            result[i] = curr.getClave();
            curr = curr.getNext();
        }
        return result;
    }
}
