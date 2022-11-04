package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsinString345 {
	public static void main(String[] args) {
		String str = "leetcode";
		String s = "";
		Set<Character> set=new HashSet<Character>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		int left=0,right=str.length()-1;
		char[] c=new char[str.length()];
		while(left<right) {
			while(!set.contains(str.charAt(left))) {
				left++;
			}
			while(!set.contains(str.charAt(right))) {
				right--;
			}
			if(left<right) {
//				character[left]=
			}
		}
		System.out.println(str);
	}
}
