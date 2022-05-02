package alStudy.stack;

import java.util.Stack;

public class stack03 {

	public static void main(String[] args) {

		String ps = "(()())((()))";
		/*
		(())())  							NO
		(((()())()  						NO
		(()())((()))  					YES
		((()()(()))(((())))() 			NO 
		()()()()(()()())()  				YES
		(()((())()( 						NO
		*/
		
		Stack <String> stack = new Stack<String>();
		String left = "";
		String right = "";
		String result = "YES";
		
		for(int i=0; i<ps.length(); i++) {
			left = ps.substring(i, i+1);
			right = ps.substring(i+1, i+2);
			if(left.equals(right)) {
				stack.push(right);
			}
		}
		System.out.println("======"+stack);
	
			
		
		if(stack.size()>0) {
			result = "NO";
		}
		System.out.println(result);
		
	}

}
