package LeetcodeProblems;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int nums1[] = { -1,0,0,3,3,3,0,0,0 };
		int nums2[] = { 1,2,2 };
		int m = 5, n = 3;
//		for (int i = 0; i < nums1.length; i++) {
//
//				nums3[j++] = nums1[i]; 
//
//		}
//		for (int i = 0; i < nums2.length; i++) {
//
//			nums3[j++] = nums2[i];
//
//	}
		
		int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && j < n) {
                nums1[i] = nums2[j++];
            }
        }
//        Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}
}
