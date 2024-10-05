// import java.util.Arrays;
// import java.util.Scanner;

// public class RemoveDuplicates {
//     public static void removeDuplicates(int[] nums) {
//         int i=0;
//         for (int j = 1; j < nums.length; j++) { 
//             if (nums[j] != nums[i]) {  
//                 i++;
//                 nums[i] = nums[j];  
//             }
//         }
//         // return i + 1;  
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] nums = new int [n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         int newLength = removeDuplicates(nums);

//         System.out.println("after rm dup now: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
//     }
// }
//*-------------------------------------------------------------------------- */


// !    0, 1, 1, 2, 3, 6, 9
// *    0, 1, 2, 1, 3, 6, 9

// ?    0, 1, 2, 3, 6, 9 


//*-------------------------------------------------------------------------- */

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 1,1, 2, 3, 6, 9};
        int n = arr.length;

        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        } 

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        int newLength = i + 1;
        int[] uniqueArr = Arrays.copyOf(arr, newLength);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
