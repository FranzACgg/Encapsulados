public class Cola implements colaInterfaz{
    int[] elementos;
    int contadorIndice;
    int inicio;
    int ultimo;

    public Cola(){
        inicio = 0;
        ultimo = 0;
    }

    @Override
    public void iniciarCola(int tamanio){
        elementos = new int[tamanio];
    }

    @Override
    public void acolar(int elemento){
        if (elementos[ultimo] != 0) {
            System.out.println("No se puede acolar; Cola ya está llena");
        }
        else {
            elementos[ultimo] = elemento;
            if (ultimo == elementos.length-1) {
                ultimo = 0;
            }
            else {
                ultimo++;
            }
        }

    }


    @Override
    public void desacolar(){

        if (elementos[inicio] == 0){
            System.out.println("No hay elementos en la cola");
            return;
        }

        elementos[inicio] = 0;

        if (inicio == elementos.length - 1){
            inicio = 0;
        }else{
            inicio ++;
        }

    }

    public int primero(){
        return elementos[inicio];
    }

    public boolean colaVacia(){
        return elementos[inicio] == 0;
    }

    public void imprimirCola(){
        for (int i : elementos){
            System.out.println(i);
        }
    }
}
