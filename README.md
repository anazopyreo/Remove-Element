# ChallengeURL
[LeetCode - Remove Element](https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150)

## Problem
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:
```
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
```
If all assertions pass, then your solution will be accepted.

## Intuition
Since only the first k elements of nums will be evaluated, I don't need to change any element after the kth one.
The simplest way to accomplish the task is to shuffle the elements that aren't being removed towards the front of the array.

## Approach
1. Initiate a pointer i for writing values to the array
2. Iterate through the array with a seperate pointer j
3. Each time an int is encountered that does not need to be removed, it is placed at i and i is incremented
4. Once iteration is finished, i is equal to the number of elements that did not get removed
5. Return i

## Complexity
  - Time Complexity: O(n) due to iterating through the array
  - Space Complexity: O(1) since only memory is used for the pointers
