class Nodo {
    char digito; // Almacena un digito del DPI
    Nodo siguiente;  // Referencia al siguiente nodo

    // Constructor que inicializa el nodo con un digito
    public Nodo(char digito) {
        this.digito = digito;
        this.siguiente = null; // Inicialmente, el siguiente nodo es null
    }
}
