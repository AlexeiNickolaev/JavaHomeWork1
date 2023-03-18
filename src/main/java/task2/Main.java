package task2;

//  Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.
public class Main {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int end = nums.length - 1;

        for (int i = 0; i <= end; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
                i--;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
