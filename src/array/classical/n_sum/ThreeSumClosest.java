package array.classical.n_sum;

import java.util.Arrays;

/**
 * 
 * @author yifengguo 
 *         Given an array nums of n integers and an integer target,
 *         find three integers in nums such that the sum is closest to target.
 *         Return the sum of the three integers. You may assume that each input
 *         would have exactly one solution.
 * 
 *         Example:
 * 
 *         Given array nums = [-1, 2, 1, -4], and target = 1.
 * 
 *         The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 */
/*
 * time = O(n ^ 2)
 * space = O(1)
 */
public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length <= 2) {
			return -1;
		}
		Arrays.sort(nums); // sort the nums which takes O(nlogn) time
		int result = nums[0] + nums[1] + nums[2]; // initial result
		int min_diff = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) { // convert to two sum
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == target) {
					return sum;
				}
				if (Math.abs(sum - target) < min_diff) {
					min_diff = Math.abs(sum - target);
					result = sum;
				}
				if (sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		return result;
	}
}
