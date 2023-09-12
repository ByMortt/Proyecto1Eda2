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
    /*
    from this method:
    void insertionSort(int a[], int n){
	int i,j,k;
	int aux;

	for(i=1; i<n; i++){
		j=i;
		aux=a[i];
		while (j>0 && aux < a[j-1]){
			a[j] = a[j-1];
			j--;
		}
		a[j]=aux;


		printf("\nIteracion numero %d \n",i);
		printArray(a,n);
	}
}
add the number of operations that the aloriythm does to the console
     */
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
}
