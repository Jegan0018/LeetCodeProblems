package LeetcodeProblems;

public class HouseRobber {
	public static void main(String[] args) {
		int[] nums= {2,7,9,3,1};
		
		int amount =0;
		int temp=0;
		if(nums.length==1) {
			System.out.println("1");
			return;
		} else if(nums.length==2) {
			amount = Math.max(nums[0], nums[1]);
			System.out.println(amount);
			return;
		}
		else {
			for(int i=0;i<nums.length;i++) {
				if(nums.length==3) {
					amount = Math.max(nums[i], nums[i+1]);
				} else {
					amount = amount+nums[i];
				}
				i++;
				if(i+2<nums.length-1) {
					temp=nums[i+2];
				} else if(i+1<nums.length-1) {
					amount = amount+nums[i+1];
					break;
				} else {
					if(i+1==nums.length-1) {
						amount = amount+nums[i+1];
						break;
					}
					while(nums[i+1]<temp) {
						i++;
						amount = amount+nums[i];
					}
				}		
			}
		}
		System.out.println(amount);
	}
}
