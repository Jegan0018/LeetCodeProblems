package LeetcodeProblems;

import java.util.Arrays;

public class MaximumSubArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 2, 1 };
		int[] nums2 = { 3, 2, 1, 4, 7 };
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int length = nums1.length;
		int count = 0;
		for (int i = 0; i <= nums1.length - 1; i++) {
			if (i > 0 && nums1[i] == nums1[i - 1]) {
				for (int j = 0; j <= nums2.length - 1; j++) {
					System.out.println(nums1[nums1.length - 1]);
					if (nums1[i] == nums2[j]) {
//						System.out.println(nums1[i]+"bbb"+nums2[j]);
						count++;
						System.out.println(count);
					}
				}
			}
		}
	}
}
