class ListaEnlazada {
    Nodo cabeza; // Primer nodo de la lista

    // Constructor que inicializa la lista vacia
    public ListaEnlazada() {
        this.cabeza = null; // Inicialmente, la lista esta vacia
    }

    // Metodo para agregar un nuevo digito al inicio de la lista
    public void addFirst(char digito) {
        Nodo nuevoNodo = new Nodo(digito); // Crear un nuevo nodo
        nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta a la antigua cabeza
        cabeza = nuevoNodo; // Actualizar la cabeza
    }

    // Metodo para agregar un nuevo digito al final de la lista
    public void add(char digito) {
        Nodo nuevoNodo = new Nodo(digito); // Crear un nuevo nodo
        if (cabeza == null) { // Si la lista esta vacia
            cabeza = nuevoNodo; 
        } else {
            Nodo actual = cabeza; // Comenzar desde la cabeza
            // Recorrer la lista hasta el final
            while (actual.siguiente != null) {
                actual = actual.siguiente; 
            }
            actual.siguiente = nuevoNodo; // Insertar el nuevo nodo al final
        }
    }

    // Metodo para agregar un nuevo digito en el medio de la lista
    public void addMiddle(char digito) {
        if (cabeza == null || cabeza.siguiente == null) {
            add(digito); // Agregar al final si hay 0 o 1 elemento
            return;
        }
        
        Nodo nuevoNodo = new Nodo(digito);
        Nodo actual = cabeza;
        int contador = 0;

        // Recorrer hasta el medio
        while (actual != null && contador < 1) { // Agregar despues del primer nodo
            actual = actual.siguiente;
            contador++;
        }

        nuevoNodo.siguiente = actual; // El nuevo nodo apunta al siguiente
        cabeza.siguiente = nuevoNodo; // Insertar en medio
    }

    // Metodo para eliminar un digito de la lista
    public void remove(char digito) {
        if (cabeza == null) return; // Si la lista esta vacia

        // Si el nodo a eliminar es la cabeza
        if (cabeza.digito == digito) {
            cabeza = cabeza.siguiente; // Movemos la cabeza al siguiente nodo
            return;
        }

        Nodo actual = cabeza; // Comenzar desde la cabeza
        // Recorrer la lista buscando el nodo a eliminar
        while (actual.siguiente != null && actual.siguiente.digito != digito) {
            actual = actual.siguiente;
        }

        // Si se encuentra el nodo a eliminar
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente; // Eliminar el nodo
        }
    }

    // Metodo para imprimir los valores de los nodos en la lista
    public void printList() {
        Nodo actual = cabeza; // Comenzar desde la cabeza
        while (actual != null) {
            System.out.print(actual.digito); // Imprimir el digito del nodo
            actual = actual.siguiente; // Mover al siguiente nodo
        }
        System.out.println(); // Nueva linea al final
    }

    // Metodo para revertir el orden de la lista
    public void reverse() {
        Nodo anterior = null; // Inicializar el nodo anterior como null
        Nodo actual = cabeza; // Comenzar desde la cabeza
        Nodo siguiente = null; // Nodo siguiente

        // Recorrer la lista y revertir los enlaces
        while (actual != null) {
            siguiente = actual.siguiente; // Guardar el siguiente nodo
            actual.siguiente = anterior; // Invertir el enlace
            anterior = actual; // Mover el anterior hacia adelante
            actual = siguiente; // Mover el actual hacia adelante
        }
        cabeza = anterior; // Actualizar la cabeza
    }

    // Metodo para verificar si un digito existe en la lista
    public boolean contains(char digito) {
        Nodo actual = cabeza; // Comenzar desde la cabeza
        while (actual != null) {
            if (actual.digito == digito) { // Si se encuentra el digito
                return true;
            }
            actual = actual.siguiente; // Mover al siguiente nodo
        }
        return false; // El digito no se encontro
    }
}


