package LeetcodeProblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		 int[] b=new int[2];
	        for(int i=0;i<nums.length;i++) {
	            if(map.containsKey(target-nums[i])) {
	                b[0]=map.get(target-nums[i]);
	                b[1]=i;
	                System.out.println(Arrays.toString(b));
	            } else {
	            	map.put(nums[i], i);
	            }
	        }
	}
}
