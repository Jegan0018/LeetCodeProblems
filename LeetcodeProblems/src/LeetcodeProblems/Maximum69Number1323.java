package LeetcodeProblems;

public class Maximum69Number1323 {
	public static void main(String[] args) {
		int num=9996;
		String s=String.valueOf(num);
		String result="";
		boolean isFlag=false;
		for(int i=0;i<s.length();i++ ) {
			if(Integer.parseInt(""+s.charAt(i))==6 && isFlag==false) {
				result+=9;
				isFlag=true;
			}
			else {
				result+=s.charAt(i);
			}
		}
		int output=Integer.parseInt(result);
		System.out.println(output);
	}
}
