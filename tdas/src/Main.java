public class Main {

    public static void main(String[] args) {
        /*Pila pila = new Pila();
        pila.iniciarPila(5);
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        System.out.println("Cantidad elementos: " + cantidadElementos(pila));
        System.out.println(pila.tope());
        System.out.println(contiene(pila, 2));*/
        /*
        Cola cola = new Cola();
        cola.InicializarCola();
        cola.Acolar(1);
        cola.Acolar(2);
        cola.Acolar(3);
        cola.Acolar(4);
        cola.Acolar(5);
        eliminar(cola, 2);
        System.out.println("Suma: " + sumar(cola));
        System.out.println(cola.Primero());
        */
        ColaPrioridad colaPrioridad = new ColaPrioridad();
        colaPrioridad.InicializarColaPrioridad();

        /*

        Ej 9

        colaPrioridad.AcolarPrioridad(8, 0);
        colaPrioridad.AcolarPrioridad(3, 0);

        colaPrioridad.AcolarPrioridad(7, 1);
        colaPrioridad.AcolarPrioridad(5, 1);
        colaPrioridad.AcolarPrioridad(4, 1);

        colaPrioridad.AcolarPrioridad(10, 2);
        colaPrioridad.AcolarPrioridad(12, 2);

        eliminarPrioridad(colaPrioridad,1);

        // |12|10|3|8| |2|2|0|0|
        System.out.println("Primero: " + colaPrioridad.Primero() + " Prioridad: " + colaPrioridad.Prioridad() + "\n"); // Primero: 8 Prioridad: 0
        colaPrioridad.Desacolar();

        // |12|10|3| |2|2|0|
        System.out.println("Primero: " + colaPrioridad.Primero() + " Prioridad: " + colaPrioridad.Prioridad() + "\n"); // Primero: 3 Prioridad: 0
        colaPrioridad.Desacolar();

        // |12|10| |2|2|
        System.out.println("Primero: " + colaPrioridad.Primero() + " Prioridad: " + colaPrioridad.Prioridad() + "\n"); // Primero: 10 Prioridad: 2
        colaPrioridad.Desacolar();

        // |12|   |2|
        System.out.println("Primero: " + colaPrioridad.Primero() + " Prioridad: " + colaPrioridad.Prioridad() + "\n"); // Primero: 12 Prioridad: 2
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
    static int cantidadElementos(Pila p) {
        int contadorPila = 0;
        Pila pInvertido = new Pila();
        pInvertido.iniciarPila(10000);
        while (!p.pilaVacia()) {
            pInvertido.apilar(p.tope());
            p.desapilar();
            contadorPila++;
        }
        while (!pInvertido.pilaVacia()) {
            p.apilar(pInvertido.tope());
            pInvertido.desapilar();
        }
        return contadorPila;
    }
    static boolean contiene(Pila p, int x) {
        boolean apareceEnPila = false;
        Pila pInvertido = new Pila();
        pInvertido.iniciarPila(10000);
        while (!p.pilaVacia()) {
            pInvertido.apilar(p.tope());
            if (p.tope() == x) {
                apareceEnPila = true;
            }
            p.desapilar();
        }
        while (!pInvertido.pilaVacia()) {
            p.apilar(pInvertido.tope());
            pInvertido.desapilar();
        }
        return apareceEnPila;
    }

    static int sumar(Cola c) {
        int sumaElementos = 0;
        Cola c2 = new Cola();
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

    static void eliminar(Cola c, int x) {
        Cola c2 = new Cola();
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

    static int contarPrioridad(ColaPrioridad cp, int p) {
        ColaPrioridad c2 = new ColaPrioridad();
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

    static void eliminarPrioridad(ColaPrioridad cp, int prioridad) {

        ColaPrioridadInterfaz aux = new ColaPrioridad();
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
