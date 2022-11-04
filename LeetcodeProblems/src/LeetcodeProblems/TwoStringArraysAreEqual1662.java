package LeetcodeProblems;

public class TwoStringArraysAreEqual1662 {
	public static void main(String[] args) {
		String[] word1= {"abc", "d", "defg"},word2= {"abcddefg"};
		String s1="",s2="";
        for(int i=0;i<word1.length;i++) {
        	s1+=word1[i];
        }
        for(int i=0;i<word2.length;i++) {
        	s2+=word2[i];
        }
        System.out.println(s1.equals(s2));  
	}
}
