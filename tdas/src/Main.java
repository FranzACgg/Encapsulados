import Implementacion_Estatico.ColaEstatica;
import Implementacion_Estatico.ColaPrioridadEstatica;
import Implementacion_Estatico.PilaEstatica;

public class Main {

    public static void main(String[] args) {
        /*
        PilaEstatica pila = new PilaEstatica();
        pila.InicializarPila();
        pila.Apilar(1);
        pila.Apilar(2);
        pila.Apilar(3);
        System.out.println("Cantidad elementos: " + cantidadElementos(pila));
        System.out.println(pila.Tope());
        System.out.println(contiene(pila, 2));
        */
        /*
        ColaEstatica cola = new ColaEstatica();
        cola.InicializarCola();
        cola.Acolar(1);
        cola.Acolar(2);
        cola.Acolar(3);
        cola.Acolar(4);
        cola.Acolar(5);
        eliminar(cola, 2);
        System.out.println("Suma: " + sumar(cola));
        System.out.println(cola.Primero());
        
        ColaPrioridadEstatica ColaPrioridadEstatica = new ColaPrioridadEstatica();
        ColaPrioridadEstatica.InicializarColaPrioridad();
        */
        /*
        Ej 9

        ColaPrioridadEstatica.AcolarPrioridad(8, 0);
        ColaPrioridadEstatica.AcolarPrioridad(3, 0);

        ColaPrioridadEstatica.AcolarPrioridad(7, 1);
        ColaPrioridadEstatica.AcolarPrioridad(5, 1);
        ColaPrioridadEstatica.AcolarPrioridad(4, 1);

        ColaPrioridadEstatica.AcolarPrioridad(10, 2);
        ColaPrioridadEstatica.AcolarPrioridad(12, 2);

        eliminarPrioridad(ColaPrioridadEstatica,1);

        // |12|10|3|8| |2|2|0|0|
        System.out.println("Primero: " + ColaPrioridadEstatica.Primero() + " Prioridad: " + ColaPrioridadEstatica.Prioridad() + "\n"); // Primero: 8 Prioridad: 0
        ColaPrioridadEstatica.Desacolar();

        // |12|10|3| |2|2|0|
        System.out.println("Primero: " + ColaPrioridadEstatica.Primero() + " Prioridad: " + ColaPrioridadEstatica.Prioridad() + "\n"); // Primero: 3 Prioridad: 0
        ColaPrioridadEstatica.Desacolar();

        // |12|10| |2|2|
        System.out.println("Primero: " + ColaPrioridadEstatica.Primero() + " Prioridad: " + ColaPrioridadEstatica.Prioridad() + "\n"); // Primero: 10 Prioridad: 2
        ColaPrioridadEstatica.Desacolar();

        // |12|   |2|
        System.out.println("Primero: " + ColaPrioridadEstatica.Primero() + " Prioridad: " + ColaPrioridadEstatica.Prioridad() + "\n"); // Primero: 12 Prioridad: 2
        */

        /*
        EJERCICIO 10

            1. Pila. para poder deshacer hay que sacar el ultimo que entro. es exactmente el principio LIFO que usan las pilas.

            2. Cola. Orden llegada es atender primero al primero que entro, por lo tanto es FIFO. no hay prioridad. por eso cola.

            3. Cola prioridad. es orden de llegada con prioridad para atender primero los incidentes criticos.

            4. Pila. mismo caso que deshacer, atras deshace los ultimo que entro. es pila

            5. Cola. otra vez, orden de llegado = FIFO. no hay prioridad.

            6. Cola prioridad. orden de llegada pero prioridad para atender primero las solicitudes mas urgentes.
        */
    }
    static int cantidadElementos(PilaEstatica p) {
        int contadorPila = 0;
        PilaEstatica pInvertido = new PilaEstatica();
        pInvertido.InicializarPila();
        while (!p.PilaVacia()) {
            pInvertido.Apilar(p.Tope());
            p.Desapilar();
            contadorPila++;
        }
        while (!pInvertido.PilaVacia()) {
            p.Apilar(pInvertido.Tope());
            pInvertido.Desapilar();
        }
        return contadorPila;
    }
    static boolean contiene(PilaEstatica p, int x) {
        boolean apareceEnPila = false;
        PilaEstatica pInvertido = new PilaEstatica();
        pInvertido.InicializarPila();
        while (!p.PilaVacia()) {
            pInvertido.Apilar(p.Tope());
            if (p.Tope() == x) {
                apareceEnPila = true;
            }
            p.Desapilar();
        }
        while (!pInvertido.PilaVacia()) {
            p.Apilar(pInvertido.Tope());
            pInvertido.Desapilar();
        }
        return apareceEnPila;
    }

    static int sumar(ColaEstatica c) {
        int sumaElementos = 0;
        ColaEstatica c2 = new ColaEstatica();
        c2.InicializarCola();
        while (!c.ColaVacia()) {
            c2.Acolar(c.Primero());
            sumaElementos += c.Primero();
            c.Desacolar();
        }
        while (!c2.ColaVacia()) {
            c.Acolar(c2.Primero());
            c2.Desacolar();
        }
        return sumaElementos;
    }

    static void eliminar(ColaEstatica c, int x) {
        ColaEstatica c2 = new ColaEstatica();
        c2.InicializarCola();
        while (!c.ColaVacia()) {
            c2.Acolar(c.Primero());
            c.Desacolar();
        }
        while (!c2.ColaVacia()) {
            if (c2.Primero() != x) {
                c.Acolar(c2.Primero());
            }
            c2.Desacolar();
        }
    }

    static int contarPrioridad(ColaPrioridadEstatica cp, int p) {
        ColaPrioridadEstatica c2 = new ColaPrioridadEstatica();
        c2.InicializarColaPrioridad();
        int cantidadPrioridad = 0;
        while (!cp.ColaVacia()) {
            if (cp.Prioridad() == p) {
                cantidadPrioridad++;
            }
            c2.AcolarPrioridad(cp.Primero(), cp.Prioridad());
            cp.Desacolar();
        }
        while (!c2.ColaVacia()) {
            cp.AcolarPrioridad(c2.Primero(), c2.Prioridad());
            c2.Desacolar();
        }
        return cantidadPrioridad;
    }

    static void eliminarPrioridad(ColaPrioridadEstatica cp, int prioridad) {

        ColaPrioridadEstatica aux = new ColaPrioridadEstatica();
        aux.InicializarColaPrioridad();

        while (!cp.ColaVacia()) {

            int valorActual = cp.Primero();
            int prioridadActual = cp.Prioridad();

            if (prioridadActual != prioridad) {
                aux.AcolarPrioridad(valorActual, prioridadActual);
            }
            cp.Desacolar();
        }
        while (!aux.ColaVacia()) {
            cp.AcolarPrioridad(aux.Primero(), aux.Prioridad());
            aux.Desacolar();
        }
    }

}
