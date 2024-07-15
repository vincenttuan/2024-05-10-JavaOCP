package day19;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		stack.push("麵");
		stack.push("料理包");
		stack.push("調味包");
		stack.push("蓋子");
		
		while (!stack.isEmpty()) {
			String item = stack.pop();
			System.out.println("提取: " + item);
		}
		
		System.out.println(stack);
		
	}
}
