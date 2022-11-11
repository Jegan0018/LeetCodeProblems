package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeTheStringGreat {
	public static void main(String[] args) {
		String str="leEeetcode";
		 StringBuilder sb=new StringBuilder(str);
	        int len=sb.length();
	        for(int i=0;i<sb.length()-1;i++){
	            char c1=sb.charAt(i);
	            char c2=sb.charAt(i+1);
	            if(c1==c2+32 || c1==c2-32){
	                sb.delete(i,i+2);
	                i=i==0?i-1:i-2;
	            }
	        }
		System.out.println(sb);
	}
}


//char c = 0;
//boolean isFlag=false;
//for(int i=0;i<str.length();i++) {
//	if(((Character.isUpperCase(str.charAt(i)) || c==str.charAt(i))&&isFlag==false)) {
//		if(Character.isLowerCase(str.charAt(i)) && isFlag==false) {
//			isFlag=true;
//			continue;
//		} else {
//			c = Character.toLowerCase(str.charAt(i));
//			continue;
//		}
//	} else {
//		temp+=str.charAt(i);
//	}
//}