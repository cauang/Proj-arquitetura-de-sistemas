import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dados = { 8, 3, 5, 1, 9, 2, 7, 4, 6 };

        MyList lista = new MyList(dados, new QuickSortStrategy());
        System.out.println("Original: " + Arrays.toString(dados));

        // QuickSort
        lista.setStrategy(new QuickSortStrategy());
        lista.sort();
        System.out.print("QuickSort : ");
        lista.print();

        // ShellSort
        lista = new MyList(dados, new ShellSort()); 
        lista.sort();
        System.out.print("ShellSort : ");
        lista.print();

        // HeapSort (nova estratégia)
        lista = new MyList(dados, new HeapSortStrategy());
        lista.sort();
        System.out.print("HeapSort  : ");
        lista.print();
    }
}
