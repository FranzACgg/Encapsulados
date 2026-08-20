public class main {

    static void main(String[] args) {


        Pila pila = new Pila();
        pila.iniciarPila(5);
        pila.apilar(1);
        pila.apilar(2);
        pila.imprimirPila();
        pila.desapilar();
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);
        pila.apilar(6);
        pila.apilar(7);

        pila.imprimirPila();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();

        System.out.println(pila.pilaVacia());

        pila.apilar(20);


        System.out.println("-----------------");







    }
}
