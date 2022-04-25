package alStudy.stack;

import java.util.Arrays;
import java.util.Stack;

public class stack02 {

	public static void main(String[] args) {

		String text = "";
		String test = "I am happy today";
		//String test = "We want to win the first prize";
		StringBuffer sb = new StringBuffer(test);
		String reverse = sb.reverse().toString();

		String[] arr = reverse.split(" ");
		//System.out.println(Arrays.toString(arr));
		Stack <String> reverseStack = new Stack<String> ();
		
		for(int i = 0; i<arr.length;  i++) {
			reverseStack.push(arr[i]);
		}
		//System.out.println("reverseStack="+reverseStack);
		
		for(int i = 0; i <arr.length;  i++) {
			text += reverseStack.pop()+ " ";
		}
		
		System.out.println(text);
		
	}

}
