/*
 * Exerise 1 PUSH(S, x) adds x at the top of the stack, In a stack of lenghtn n
 * , it iwll add it at index n - 1 POP(S) removes the element at the top of the
 * stack, the element at index n - 1
 */

import java.util.*;

public class StackTest {
	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(4);
		System.out.println(s);
	}
}