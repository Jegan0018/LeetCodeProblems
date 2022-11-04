package LeetcodeProblems;

import java.util.TreeSet;

public class HappyNumber202 {
	public static void main(String[] args) {
		int num=19;
		int sum=0,rem=0,flag=0;
		TreeSet<Integer> set=new TreeSet<Integer>();
		while(num!=1) {
			if(set.contains(num)== false) {
				set.add(num);
			} else {
				System.out.println("False");
				return;
			}
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem);
				num=num/10;
			}
			num=sum;
			sum=0;
		}
		
		System.out.println("True");
		
	}
}
