/*
 * Exerise 1 PUSH(S, x) adds x at the top of the stack, In a stack of lenghtn n
 * , it iwll add it at index n - 1 POP(S) removes the element at the top of the
 * stack, the element at index n - 1
 */

import java.util.*;

public class StackTest {
	public static void main(String[] args) {

		Stack<Integer> s = new Stack();
		for (int i = 1; i <= 6; i++) {
			s.push(i);
		}
		System.out.println(s);
		s.push(4);
		s.push(1);
		s.push(3);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push(8);
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
}