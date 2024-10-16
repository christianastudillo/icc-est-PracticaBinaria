import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MetodosBusqueda mB = new MetodosBusqueda();

        int[] arreglo = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arreglo[i] = i + 1;
        }

   
        mB.printArreglo(arreglo);

        long startTime = System.currentTimeMillis();
        int posicionSecuencial = mB.busquedaSecuencial(arreglo, 30);
        long endTime = System.currentTimeMillis();
        
        if (posicionSecuencial != -1) {
            System.out.println("Secuencial: El valor se encuentra en la posición: " + posicionSecuencial);
        } else {
            System.out.println("Secuencial: Valor no encontrado...");
        }
        System.out.println("Tiempo de búsqueda secuencial: " + (endTime - startTime) + " milisegundos");

        startTime = System.currentTimeMillis();
        int posicionBinaria = mB.busquedaBinaria(arreglo, 30);
        endTime = System.currentTimeMillis();

        if (posicionBinaria != -1) {
            System.out.println("Binaria: El valor se encuentra en la posición: " + posicionBinaria);
        } else {
            System.out.println("Binaria: Valor no encontrado...");
        }
        System.out.println("Tiempo de búsqueda binaria: " + (endTime - startTime) + " milisegundos");

        sc.close();
    }
}