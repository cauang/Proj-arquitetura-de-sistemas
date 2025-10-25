public class QuickSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] arr) {
        quick(arr, 0, arr.length - 1);
    }

    private void quick(int[] a, int l, int r) {
        if (l >= r) return;
        int i = l, j = r;
        int p = a[(l + r) / 2]; // pivô simples
        while (i <= j) {
            while (a[i] < p) i++;
            while (a[j] > p) j--;
            if (i <= j) {
                swap(a, i, j);
                i++; j--;
            }
        }
        if (l < j) quick(a, l, j);
        if (i < r) quick(a, i, r);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
