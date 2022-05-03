package alStudy.stack;

import java.util.Stack;

public class stack03 {

	public static void main(String[] args) {

		//String ps =  "(())())"; 			//NO
		//String ps ="(((()())()";  			//NO
		//String ps ="(()())((()))";  			//YES
		//String ps ="((()()(()))(((())))()"; 		//NO 
		//String ps ="()()()()(()()())()";  		//YES
		String ps ="(()((())()("; 			//NO
		
		Stack <String> stack = new Stack<String>();
		Stack <String> stack2 = new Stack<String>();
		String left = "";
		String right = "";
		String result = "YES";
		String [] array = ps.split("");
		for(String word : array) {
			stack.push(word);
		}
		int size = stack.size();
		for(int i=0; i<size; i++) {
			if(!stack.empty()) {
				left = stack.pop();
			}
			if(!stack.empty() && stack.size()>0) {
				right = stack.pop();
			}
			//System.out.println("left="+left);
			//System.out.println("right="+right);
			if(left.equals(right)) {
				stack.push(left);
				stack2.push(right);
			}else if(!left.equals(right) && !stack.empty()) {
				if(!stack2.empty()) {
					stack.push(stack2.pop());
				}
			}
			//System.out.println("stack="+stack);
			//System.out.println("stack2="+stack2);
			if(stack.empty()) {
				break;
			}
		}
		
		if(stack.size()>0 || stack2.size()>0) {
			result = "NO";
		}
		System.out.println(result);
		
	}

}
