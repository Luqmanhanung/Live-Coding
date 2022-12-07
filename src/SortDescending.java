import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 2, 9, 7, 3, 8, 11, 0};

        //Cara Pertama

        Arrays.sort(nums);
        // reverse the array, just like dumping the array!
        // swap(1st, 1st-last) <= 1st: 0, 1st-last: nums.length - 1
        // swap(2nd, 2nd-last) <= 2nd: i++,  2nd-last: j--
        // swap(3rd, 3rd-last) <= 3rd: i++,  3rd-last: j--

        for (int i = 0, j = nums.length - 1, tmp; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //Cara Kedua

        int[] arrDesc = Arrays.stream(nums).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arrDesc));
    }
}
