public class Busqueda {
    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length -1;
        int cont = 0 ;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            cont++;
            System.out.println("Contador Binario: " + cont);
            if (arr[medio] == value) {
                
                //Elemento encontrado
                return medio;
            }
            if (arr[medio] < value) {
                inicio = medio + 1;//Buscar en la midad de la derecha 
            }else{
                fin = medio - 1;//Buscar en la midad de la izquierda 
            }
        }

        return -1;
    }

    public void printArreglo(int[] arreglo){
        for (int elem : arreglo) {
            System.out.print(elem + " ");
        }
    }
}
