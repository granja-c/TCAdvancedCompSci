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
    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    public static <T extends Comparable<T>> void quickSort(T[] arr, int l, int h) {
        if (l < h) {
            int piv = partition(arr, l, h);
            quickSort(arr, l, piv-1);
            quickSort(arr, piv+1, h);
        }
    }
    public static <T extends Comparable<T>> int partition(T[] arr, int l, int h) {
        T piv = arr[h];
        int i = l-1;
        for (int j = l; j < h; j++) {
            if (arr[j].compareTo(piv) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }

    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
      mergeSort(arr, 0, arr.length-1);
    }
    public static <T extends Comparable<T>> void mergeSort(T[] arr, int l, int r){
        if (arr.length > 1) {
            int mid = arr.length/2;
            var lef = (T[]) new Comparable[mid];
            var rig = (T[]) new Comparable[mid];
            for (int i = 0; i < mid; i++) {
                lef[i] = arr[i];
            }
            int n = 0;
            for (int i = mid; i < arr.length; i++) {
                rig[n] = arr[i];
                n++;
            }
            mergeSort(lef);
            mergeSort(rig);
            merge(arr, lef, rig);
        }
    }
    public static <T extends Comparable<T>> void merge(T[] arr, T[] l, T[] r) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.length && j < r.length) {
            if (l[i].compareTo(r[j]) < 0) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < l.length) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }

}
