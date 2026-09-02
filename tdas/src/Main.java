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
}
