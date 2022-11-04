package LeetcodeProblems;

public class MaximumSubArray53 {
	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int n = nums.length;
		int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
        	int sum=0;
        	for(int j=i;j<nums.length;j++) {
        		sum=sum+nums[j];
        		max=Math.max(max, sum);
        	}
        }
        System.out.println(max);
	}
}
