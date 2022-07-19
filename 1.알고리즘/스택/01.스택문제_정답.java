package alStudy.stack;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class stack01 {

	public static void main(String[] args) throws IOException{
		//수정테스트
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack =new Stack<Integer>();
		
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			String in = sc.next();
			
			switch (in) {
			
			case "push":
				stack.push(sc.nextInt());
				break;

			case "pop":
				if(stack.empty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.pop());
				}
				break;
			
			case "size":
				System.out.println(stack.size());
				break;
			
			case "empty":
				if(stack.empty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
				
			case "top":
				if(stack.empty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				}
				break;
			}
		}
	}

}
