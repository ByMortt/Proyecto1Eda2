public class Main {
    public static void main(String[] args) {
        //create an array of 10 elements and fill it with random numbers from 0 to 100 and print the array to the console using the print method from Utilerias class, then sort the array using the insertionSort method from Ordenamientos class and print the array to the console again using the print method from Utilerias class
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 101);
        }

        //create 6 copies of the array to sort
        int[] array1 = array.clone();
        int[] array2 = array.clone();
        int[] array3 = array.clone();
        int[] array4 = array.clone();
        int[] array5 = array.clone();
        int[] array6 = array.clone();

        Utilerias.print(array);
        //Selection sort
        System.out.println("Selection sort");
        Ordenamientos.selectionSort(array);
        //Insertion sort
        System.out.println("Insertion sort");
        Ordenamientos.insertionSort(array1);
        //Bubble sort
        System.out.println("Bubble sort");
        Ordenamientos.bubbleSort(array2);
        //heap sort
        System.out.println("Heap sort");
        Ordenamientos.heapSort(array3);
    }
}