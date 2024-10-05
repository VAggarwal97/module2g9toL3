import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        int n = nums.length;  
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 9, 3, 6, 1, 2 };
        selectionSort(nums);
        System.out.println("S-Array now: " + Arrays.toString(nums));
    }
}
