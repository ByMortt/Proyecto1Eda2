public class Main {
    public static void main(String[] args) {
        //create an array of 10 elements and fill it with random numbers from 0 to 100 and print the array to the console using the print method from Utilerias class, then sort the array using the insertionSort method from Ordenamientos class and print the array to the console again using the print method from Utilerias class
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 101);
        }
        Utilerias.print(array);
        Ordenamientos.selectionSort(array);
    }
}