package Algorithms;
import java.util.Arrays;
import java.util.Random;

@SuppressWarnings({"unchecked", "unusued", "ManualArrayCopy"})
public class SortingAlgorithms {
    private static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) swap(arr, j, j+1);
            }
        }
    }


    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            var key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static <T extends Comparable<T>> void insertionSort(T[] arr, int size) {
        for (int i = 1; i < size; i++) {
            var key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j].compareTo(key) < 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }


    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
    public static <T extends Comparable<T>> void shellSort(T[] arr) {
        int n = arr.length/2;
        int gap = n/2;
        while (gap > 0) {
            for (int i = gap; i < n-1; i++) {
                var temp = arr[i];
                int j = i;
                while (j >= gap && arr[j-gap].compareTo(temp) > 0) {
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap /= 2;
        }
    }

}
