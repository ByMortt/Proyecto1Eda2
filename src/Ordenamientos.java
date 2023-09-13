public class Ordenamientos {
    // Selection sort
    public static void selectionSort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int operations;
        for (int i = 0; i < array.length - 1; i++) {
            int indexMinor = i;
            for (int j = i + 1; j < array.length; j++) {
                comparisons++;
                if (array[j] < array[indexMinor]) {
                    indexMinor = j;
                }
            }
            if (i != indexMinor) {
                swaps++;
                Utilerias.swap(array, i, indexMinor);
            }
            System.out.printf("\nIteracion numero %d \n", i + 1);
            Utilerias.print(array);
        }
        operations = comparisons + swaps;
        System.out.printf("Comparaciones: %d\n", comparisons);
        System.out.printf("Intercambios: %d\n", swaps);
        System.out.printf("Operaciones: %d\n", operations);
    }

    // Insertion sort
    public static void insertionSort(int[] array) {
        int operations = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int aux = array[i];
            while (j > 0 && aux < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = aux;
            operations++;
            System.out.printf("\nIteracion numero %d \n", i);
            Utilerias.print(array);
        }
        System.out.printf("Operaciones: %d\n", operations);
    }

    /*Bubble sort
    from this structure:
        void bubbleSort(int a[], int size) {
    int i, j, n;
    n = size;

    for (i = n - 1; i > 0; i--) {
        bool swapped = false; // Flag para verificar si hubo intercambios en esta iteración

        for (j = 0; j < i; j++) {
            if (a[j] > a[j + 1]) {
                swap(&a[j], &a[j + 1]);
                swapped = true; // Se produjo un intercambio
            }
        }

        if (!swapped) {
            break; // Si no hubo intercambios, el arreglo ya está ordenado
        }

        printf("\nIteracion numero %d \n",n-i);
		printArray(a,n);
    }
}
print the number of comparisons and swaps made by the algorithm and the total number of operations (comparisons + swaps)

     */
    public static void bubbleSort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int operations;
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
                    Utilerias.swap(array, j, j + 1);
                    swapped = true;
                    swaps++;
                }
            }
            if (!swapped) {
                break;
            }
            System.out.println("Iteracion numero " + (n - i));
            Utilerias.print(array);
        }
        operations = comparisons + swaps;
        System.out.println("Lista ordenada");
        Utilerias.print(array);
        System.out.printf("Comparaciones: %d\n", comparisons);
        System.out.printf("Intercambios: %d\n", swaps);
        System.out.printf("Operaciones: %d\n", operations);
    }

    //Heap sort, but add the total number of operations (comparisons + swaps) that made the algorithm (includes heapyfy and buildHeap)
    public static void heapSort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int operations;
        int n = array.length;
        Utilerias.buildHeap(array, n);
        for (int i = n - 1; i > 0; i--) {
            Utilerias.swap(array, 0, i);
            swaps++;
            Utilerias.heapify(array, i, 0);
            comparisons++;
            System.out.println("Iteracion numero " + (n - i));
            Utilerias.print(array);
        }
        operations = comparisons + swaps;
        System.out.println("Lista ordenada");
        Utilerias.print(array);
        System.out.println("Operaciones de heap sort");
        System.out.printf("Comparaciones: %d\n", comparisons);
        System.out.printf("Intercambios: %d\n", swaps);
        System.out.printf("Operaciones: %d\n", operations);
    }

}
