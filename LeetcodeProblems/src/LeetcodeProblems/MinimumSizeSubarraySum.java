package LeetcodeProblems;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
	public static void main(String[] args) {
		int nums[] = {2,16,14,15};
		int target = 20;
		int sum=0;
		int j=0;
		int length = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			if(nums[i] == target) {
				length = 1;
				break;
			}
			while(sum >= target) {
				sum -= nums[j];
                length = Math.min(length,i-j+1);
				j++;
			}
		}
        if(length == Integer.MAX_VALUE) {
            System.out.println("0");
        }
        else {
            System.out.println(length);
        }
		
	}
}
