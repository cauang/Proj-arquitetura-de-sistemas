public class HeapSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;

        // constroi heap (max-heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // extrai um por um
        for (int end = n - 1; end > 0; end--) {
            swap(arr, 0, end);    
            heapify(arr, end, 0);  
        }
    }

    private void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) largest = l;
        if (r < n && a[r] > a[largest]) largest = r;

        if (largest != i) {
            swap(a, i, largest);
            heapify(a, n, largest);
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
