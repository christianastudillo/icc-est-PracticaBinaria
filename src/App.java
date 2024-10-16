import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();


        System.out.print("Ingrese la cantidad de personas del listado: ");
        int cantidadPersonas = sc.nextInt();

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese Persona: ");
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            listaPersonas.add(new Persona(nombre, edad));
        }

        Busqueda.ordenarPorInsercion(listaPersonas);

        System.out.print("Ingrese la edad a buscar: ");
        int edadBuscada = sc.nextInt();

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