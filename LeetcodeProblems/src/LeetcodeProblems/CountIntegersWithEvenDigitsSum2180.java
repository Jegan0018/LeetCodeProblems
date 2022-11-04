package LeetcodeProblems;

public class CountIntegersWithEvenDigitsSum2180 {
	public static void main(String[] args) {
		int sum=0,rem=0,count=0;
		int num=1;
		for(int index=1;index<=num;index++) {
			int temp=index;
			if(temp>=10) {
				while(temp>0) {
					rem=temp%10;
					sum+=rem;
					temp/=10;
					if(sum%2==0 && temp<=0) {
						count++;
						sum=0;
					}
				}
				sum=0;
			} else {
				rem=temp%10;
				sum+=rem;
				if(sum%2==0) {
					count++;
				}
				sum=0;
			}
		}
		System.out.println(count);
	}
}
