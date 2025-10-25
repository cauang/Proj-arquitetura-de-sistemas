public class ShellSort implements SortStrategy {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        // gaps simples: n/2, n/4, ..., 1
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int tmp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > tmp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = tmp;
            }
        }
    }
}
