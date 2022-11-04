package LeetcodeProblems;

public class JumpGame {
	public static void main(String[] args) {
		int[] nums= {2,3,1,1,4};
		int flag=0;
		if(nums.length==1) {
			System.out.println("True");
			return;
		}
		for(int i=0;i<nums.length;i++) {
			int temp=nums[i]-1;
			while(temp>0) {
				i++;
				temp--;
			}
			if(i==nums.length-1) {
				flag=1;
				System.out.println("true");
				return;
			}
        }
		if(flag==0) {
			System.out.println("False");
		}
	}
}
