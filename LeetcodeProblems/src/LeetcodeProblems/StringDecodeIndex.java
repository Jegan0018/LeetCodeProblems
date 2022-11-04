package LeetcodeProblems;

public class StringDecodeIndex {
	public static void main(String[] args) {
		String s="leet2code3";
		String str="",t="";
		int k=10;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='1' && s.charAt(i)<='9') {
				for(int j=0;j<s.charAt(i)-48;j++) {
					t += str;
				}
//				str=t;
//				t="";
			} else {
				str = str+s.charAt(i);
			}
		}
		System.out.println(t);
		String sm=""+str.charAt(k-1);
		System.out.println(sm);
	}
}
