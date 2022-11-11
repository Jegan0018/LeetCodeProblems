package LeetcodeProblems;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String str="()";
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{') {
				stack.push(str.charAt(i));
			} else {
				char top = (char) stack.peek();
                if(c == '}' && top == '{' ||
                  c == ')' && top =='(' ||
                  c == ']' && top == '['){
                    stack.pop();
                }
			}
		}
		if(stack.isEmpty()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
