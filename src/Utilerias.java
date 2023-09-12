public class Utilerias {
    // swap method implementation for int arrays
    public static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    // print method implementation for int arrays
    public static void print(int[] array) {
        for (int j : array) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

}