package LeetcodeProblems;
//Submitted
public class UglyNumber {
	public static void main(String[] args) {
		int n = 42;
		if(n == 0) {
            System.out.println("False");
        }
        while(n!=1) {
            if(n%2 == 0) {
                n/=2;
            }
            else if(n%3 == 0) {
                n/=3;
            }
            else if(n%5 == 0) {
                n/=5;
            }
            else {
                System.out.println("False");
                break;
            }
        }
        System.out.println("True");
	}
}
