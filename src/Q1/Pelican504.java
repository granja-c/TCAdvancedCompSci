package Q1;

public class Pelican504 {
    public static void main(String[] args) {
        int i[] = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
        Integer iw[] = new Integer[14];
        for (int k = 0; k < 14; k++) {
            iw[k] = i[k];
        }

    }
    private static int binarySearch(Object a[], Object val) {
        int lb = 0;
        int ub = a.length-1;
        while (lb <= ub) {
            int mid = (lb+ub)/2;
            if (a[mid].compareTo(val) == 0) return mid;
            else if (val.compareTo(a[mid]) > 0) lb = mid + 1;
            else ub = mid - 1;
        }
        return -1;
    }
}
