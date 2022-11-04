package LeetcodeProblems;

public class FindTheDifference389 {
	public static void main(String[] args) {
		String s="abcd";
		String t="abcde";
		int s1=0,s2=0;
		for(int i=0;i<s.length();i++) {
			s1 += s.charAt(i);
		}
		for(int i=0;i<t.length();i++) {
			s2 += t.charAt(i);
		}
		System.out.println((char)(s2-s1));
	}
}
