package LeetcodeProblems;

import java.util.Arrays;
//2149
public class RearrangeArrayElementsBySign {
	public static void main(String[] args) {
		int[] a= {3,1,-2,-5,2,-4};
		int[] merge=new int[a.length];
		int j=0,k=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				merge[j]=a[i];
				j+=2;
			} else {
				merge[k]=a[i];
				k+=2;
			}
		}
		System.out.println(Arrays.toString(merge));
	}
}
