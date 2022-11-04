package LeetcodeProblems;

import java.util.Arrays;

public class MaximumLengthOfRepeatedSubArray {
	public static void main(String[] args) {
		int nums1[]= {1,2,3,2,1};
		int nums2[]= {3,2,1,4,7};
		Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j=0;
        for(int i=0;i<nums1.length-1;i++) {
        	if(nums1[i]!=nums1[i+1]) {
        		nums1[j++]=nums1[i];
        	}
        }
        nums1[j++]=nums1[nums1.length-1];
        System.out.println(Arrays.toString(nums1));
        j=0;
        for(int i=0;i<nums2.length-1;i++) {
        	if(nums2[i]!=nums2[i+1]) {
        		nums2[j++]=nums2[i];
        	}
        }
        nums2[j++]=nums2[nums2.length-1];
        System.out.println(Arrays.toString(nums2));
        int length = nums1.length+nums2.length;
        int count = 0;
        for(int i=0;i<nums1.length;i++) {
            // for(j=0;j<nums2.length-1;j++) {
                if(nums1[i] == nums2[i]) {
                    count++;
                }
            // }
        }
        System.out.println(count);
	}
}
