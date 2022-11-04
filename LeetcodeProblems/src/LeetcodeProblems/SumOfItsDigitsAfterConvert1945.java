package LeetcodeProblems;

public class SumOfItsDigitsAfterConvert1945 {
	public static void main(String[] args) {
		int sum=0,k=2;
		String str="leetcode";
		String num="",value="";
		for(int index=0;index<str.length();index++) {
			num+=(int)str.charAt(index)-96;
		}
		while(k!=0) {
			for(int index=num.length()-1;index>=0;index--) {
				sum+=Integer.parseInt(""+num.charAt(index));
			}
			k--;
			if(k>0) {
				num=String.valueOf(sum);
				sum=0;
			}
		}
		
		System.out.println(sum);
	}
}
