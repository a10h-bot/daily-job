import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] A = { 2, 40, 88, 9, 10, 0, -1, -89 };
        int x = 0;
        int y = A.length - 1;
        quickSort(A, x, y);
        System.out.println(Arrays.toString(A));

    }

    public static void quickSort(int[] arr, int left, int right) {
        int pivotIndex = left + (right - left) / 2;
        int pivotValue = arr[pivotIndex];
        int i = left, j = right;
        while (i <= j) {
            while (arr[i] < pivotValue) {
                i++;
            }
            while (arr[j] > pivotValue) {
                j--;
            }
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
            if (left < i) {
                quickSort(arr, left, j);
            }
            if (right > i) {
                quickSort(arr, i, right);
            }
        }
    }
}