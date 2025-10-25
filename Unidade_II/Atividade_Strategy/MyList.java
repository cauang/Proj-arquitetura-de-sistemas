import java.util.Arrays;

public class MyList {
    private int[] data;
    private SortStrategy strategy;

    public MyList(int[] data, SortStrategy strategy) {
        this.data = Arrays.copyOf(data, data.length);
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        if (strategy == null) throw new IllegalStateException("Defina uma estratégia antes de ordenar.");
        strategy.sort(data);
    }

    public int[] getData() {
        return Arrays.copyOf(data, data.length);
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
