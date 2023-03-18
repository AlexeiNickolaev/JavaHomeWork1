package task2;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3 };
        int val = 3;
        int end = arr.length - 1;

        for (int i = 0; i <= end; i++) {
            if (arr[i] == val) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
                i--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
