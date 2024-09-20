package Q1;

public class Pelican401 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 1, 3, 18, 0, 9 , 6};
        sort(arr, 0, arr.length-1);

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
    }
    public static void merge(int a[], int l, int mid, int r) {
        int tmpArr[] = new int[r-l+1];
        int ind1 = l;
        int ind2 = mid+1;
        int ind = 0;

        while(ind1 <= mid && ind2 <= r) {
            if(a[ind1] < a[ind2]) {
                tmpArr[ind] = a[ind1];
                ind1++;
            } else {
                tmpArr[ind] = a[ind2];
                ind2++;
            }
            ind++;
        }
        while (ind1 <= mid) {
            tmpArr[ind] = a[ind1];
            ind1++;
            ind++;
        }
        while (ind2 <= r) {
            tmpArr[ind]  = a[ind2];
            ind2++;
            ind++;
        }
        for (ind = 0; ind < tmpArr.length; ind++) {
            a[l+r] = tmpArr[ind];
        }
    }
    public static void sort(int[] a, int l , int r) {
        if (r == l) return;
        int mid = (l+r) / 2;
        sort(a, l, mid);
        sort(a, mid+1, r);
        merge(a, l, mid, r);
    }
}
