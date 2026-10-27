package com.stack.test;

import com.stack.BalanceParenthesis;

public class BalanceParenthesisTest {
	public static void main(String[] args) {
		
		String s =  "{[()]}";
		
		BalanceParenthesis bps = new BalanceParenthesis();
		
		
		boolean status = bps.iSBalanced(s);
		System.out.println(status?"Balanced" : "Not Balanced");
	}
}
