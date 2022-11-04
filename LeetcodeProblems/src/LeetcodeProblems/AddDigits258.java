package LeetcodeProblems;

public class AddDigits258 {
	public static void main(String[] args) {
		int num=119;
		int sum=0,rem=0;
        while(num>0) {
            rem=num%10;
            sum+=rem;
            num/=10;
            if(sum>=10 && num<=0) {
            	num=sum;
            	sum=0;
            }
        }
        System.out.println(sum); 
	}
}
