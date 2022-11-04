package LeetcodeProblems;
//2390
public class RemovingStarsFromAString {
	public static void main(String[] args) {
		String s="leet**cod*e";
		StringBuilder m=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				m.deleteCharAt(m.length()-1);
				System.out.println(m);
			} else {
				m.append(s.charAt(i));
			}
		}
		System.out.println(m);
	}
}
