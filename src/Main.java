import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        int[] expectedNums1 = {2,2};
        System.out.println(testSolution(nums1, val1, expectedNums1));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int[] expectedNums2 = {0,1,4,0,3};
        System.out.println(testSolution(nums2, val2, expectedNums2));
    }

    private static boolean testSolution(int[] nums, int val, int[] expectedNums){
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);
        if(k != expectedNums.length)
            return false;
        Arrays.sort(nums,0,k);
        Arrays.sort(expectedNums);
        for(int i = 0; i < expectedNums.length; i++)
            if(nums[i] != expectedNums[i])
                return false;
        return true;
    }
}
/*
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
 */