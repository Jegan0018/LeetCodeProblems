package LeetcodeProblems;

public class CountAndSay38 {
	public static void main(String[] args) {
		int num=4;
		String s="1",str="";
		if(num==1) {
			System.out.println("1");
		}
		String temp="";
		for(int i=0;i<num-1;i++) {
			int count=1;
			for(int j=0;j<s.length()-1;j++) {
				if(s.charAt(j)==s.charAt(j+1)) {
					count++;
				} else {
					temp+=count;
					temp+=s.charAt(j);
					count=1;
				}
			}
			temp+=count;
			temp+=s.charAt(s.length()-1);
			s="";
			s+=temp;
			if(i==(num-2)) {
				System.out.println(temp);
			}
			temp="";
		}
	}
}
