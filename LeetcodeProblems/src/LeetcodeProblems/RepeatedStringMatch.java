package LeetcodeProblems;
//686
public class RepeatedStringMatch {
	public static void main(String[] args) {
		String a="abc",b="cabcabca",c="";
        int count=0;
        for(int i=0;i<=b.length();i++){
            if(c.contains(b)) {
                System.out.println(count);
            	break;
            }
            else{
                c+=a;
                count++;
            }
        }
        if(!c.contains(b)) {
        	System.out.println("-1");
        }
	}
}
