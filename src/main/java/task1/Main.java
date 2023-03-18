package task1;

// Задать одномерный массив и найти в нем минимальный и максимальный элементы.

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 17, 30, 4, 66, 8, 2};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
