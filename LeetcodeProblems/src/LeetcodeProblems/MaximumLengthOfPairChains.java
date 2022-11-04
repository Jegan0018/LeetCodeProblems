package LeetcodeProblems;

import java.util.Arrays;

public class MaximumLengthOfPairChains {
	public static void main(String[] args) {
		int[][] pairs={
				{4,10},
				{5,15},
				{12,19},
				{20,30},
				{26,29},
				{34,58}
		};
		Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
		int max=pairs[0][1],length=1;
		for(int i=0;i<pairs.length;i++) {
			if(pairs[i][0]>max) {
				length++;
				max=pairs[i][1];
			}
		}
		for (int[] arr : pairs) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(length);
	}
}
