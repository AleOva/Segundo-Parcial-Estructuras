import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre al inicio
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar DPI
        System.out.print("Ingrese su numero de DPI: ");
        String dpi = scanner.nextLine();

        ListaEnlazada lista = new ListaEnlazada(); // Crear una nueva lista enlazada

        // Agregar cada digito del DPI a la lista
        for (char digito : dpi.toCharArray()) {
            lista.add(digito);
        }

        // Mensaje de bienvenida
        System.out.println("Bienvenido, " + nombre + "!");

        int opcion;
        do {
            // Mostrar el menu
            System.out.println("\nMenu principal");
            System.out.println("1. Agregar un digito al inicio");
            System.out.println("2. Agregar un digito al final");
            System.out.println("3. Agregar un digito en el medio");
            System.out.println("4. Remover un digito");
            System.out.println("5. Mostrar lista actual");
            System.out.println("6. Invertir lista");
            System.out.println("7. Verificar si un digito esta en la lista");
            System.out.println("8. Mostrar lista final y salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva linea

            switch (opcion) {
                case 1: // Agregar un digito al inicio
                    System.out.print("Ingrese el digito a agregar al inicio: ");
                    char digitoAgregarInicio = scanner.nextLine().charAt(0);
                    lista.addFirst(digitoAgregarInicio);
                    break;
                case 2: // Agregar un digito al final
                    System.out.print("Ingrese el digito a agregar al final: ");
                    char digitoAgregar = scanner.nextLine().charAt(0);
                    lista.add(digitoAgregar);
                    break;
                case 3: // Agregar un digito en el medio
                    System.out.print("Ingrese el digito a agregar: ");
                    char digitoAgregarMedio = scanner.nextLine().charAt(0);
                    lista.addMiddle(digitoAgregarMedio);
                    break;
                case 4: // Remover un digito
                    System.out.print("Ingrese el digito a remover: ");
                    char digitoEliminar = scanner.nextLine().charAt(0);
                    lista.remove(digitoEliminar);
                    System.out.println("Lista despues de la eliminacion:");
                    lista.printList();
                    break;
                case 5: // Mostrar lista actual
                    System.out.println("Lista actual:");
                    lista.printList();
                    break;
                case 6: // Invertir lista
                    lista.reverse();
                    System.out.println("Lista despues de revertir:");
                    lista.printList();
                    break;
                case 7: // Verificar si un digito esta en la lista
                    System.out.print("Ingrese el digito a buscar: ");
                    char digitoBuscar = scanner.nextLine().charAt(0);
                    boolean encontrado = lista.contains(digitoBuscar);
                    System.out.println("¿El digito " + digitoBuscar + " esta en la lista? " + encontrado);
                    break;
                case 8: // Mostrar lista final y salir
                    System.out.println("Lista final:");
                    lista.printList();
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}

