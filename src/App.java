import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        int cantidadPersonas;

        do {
            System.out.print("Ingrese la cantidad de personas del listado: ");
            cantidadPersonas = sc.nextInt();
            if (cantidadPersonas < 0) {
                System.out.println("Error: La cantidad de personas no puede ser negativa.");
            }
        } while (cantidadPersonas < 0);

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese Persona " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = sc.next();

            int edad;
            do {
                System.out.print("Edad: ");
                edad = sc.nextInt();
                if (edad < 0) {
                    System.out.println("Error: La edad no puede ser negativa.");
                }
            } while (edad < 0);

            listaPersonas.add(new Persona(nombre, edad));
        }

        Busqueda.ordenarPorInsercion(listaPersonas);

        int edadBuscada;
        do {
            System.out.print("Ingrese la edad a buscar: ");
            edadBuscada = sc.nextInt();
            if (edadBuscada < 0) {
                System.out.println("Error: La edad no puede ser negativa.");
            }
        } while (edadBuscada < 0);

        Busqueda busqueda = new Busqueda();
        int posicion = busqueda.busquedaBinaria(listaPersonas, edadBuscada);

        if (posicion != -1) {
            System.out.println("La persona con la edad " + edadBuscada + " es " + listaPersonas.get(posicion).getNombre());
        } else {
            System.out.println("No se encontró una persona con la edad " + edadBuscada);
        }

        sc.close();
    }
}