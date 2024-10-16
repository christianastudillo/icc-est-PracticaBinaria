import java.util.ArrayList;
public class Busqueda {
    public int busquedaBinaria(ArrayList<Persona> lista, int valorBuscado) {
        int bajo = 0;
        int alto = lista.size() - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            Persona personaCentro = lista.get(centro);
            // for (Persona p : lista) {
            //     System.out.print(p.getEdad() + " ");
            // }
            for (int i = bajo; i <= alto; i++) {
                System.out.print(lista.get(i).getEdad() + " | ");
            }
            System.out.print("\nbajo=" + bajo + " alto=" + alto + " centro=" + centro + " valorCentro=" + personaCentro.getEdad());
            System.out.println(" ");

            if (personaCentro.getEdad() == valorBuscado) {
                return centro; 
            } else if (personaCentro.getEdad() < valorBuscado) {
                System.out.println(" --> Derecha");
                bajo = centro + 1;
            } else {
                System.out.println(" -->Izquierda");
                alto = centro - 1;
            }
        }
        return -1; 
    }
    public static void ordenarPorInsercion(ArrayList<Persona> lista) {
        int tamanio = lista.size();

        for (int i = 1; i < tamanio; i++) {
            Persona aux = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j).getEdad() > aux.getEdad()) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }
    }
}