package Algoritmos_de_Ordenação;

public class Main {
    public static void main(String[] args) {
        int[] valores = new int[] { 7, 2, 3, 8, 1};
        BubbleSort.bubbleSort(valores);
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + ", ");
        }
    }
}

class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Trocar os elementos arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
