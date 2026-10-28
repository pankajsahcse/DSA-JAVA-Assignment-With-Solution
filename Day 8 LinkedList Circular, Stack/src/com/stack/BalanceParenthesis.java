package com.stack;

import java.util.Stack;

public class BalanceParenthesis {

	// method for checking Balance or not
	public boolean iSBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Opening Brackets

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}

			// Closing Bracket
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.pop();

				if ((ch == '(' && top != ')') || 
						(ch == '{' && top != '}') || 
						(ch == '[' && top != ']')) {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}
}
