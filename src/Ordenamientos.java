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
}
