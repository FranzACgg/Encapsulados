public class Pila implements PilaInterfaz{
    int[] elementos;
    int contadorIndice;

    public Pila(){
        contadorIndice = 0;
    }

    public void imprimirPila(){
        for (int elemento : elementos){
            System.out.println(elemento);
        }
    }

    @Override
    public void iniciarPila(int tamanio){
        elementos = new int[tamanio];
    }

    @Override
    public void apilar(int elemento){
        if (contadorIndice == elementos.length){
            System.out.println("La pila no acepta mas elementos");
            return;
        }
        elementos[contadorIndice] = elemento;
        contadorIndice ++;
    }

    @Override
    public void desapilar(){
        if (contadorIndice == 0){
            System.out.println("No hay elemento en la pila");
            return;
        }
        contadorIndice --;
    }

    @Override
    public  int tope(){
        if (contadorIndice == 0){
            System.out.println("La pila esta vacia");
            return 0;
        }

        return elementos[contadorIndice - 1];
    }

    @Override
    public boolean pilaVacia(){
        return contadorIndice == 0;
    }

}
