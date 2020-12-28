package com.min.edu;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();
//		String result = t.question1("123456");
		System.out.println(t.question1("123456"));
	}

	public String question1(final String str) {
		StringBuilder sb = new StringBuilder();
		
		int n = str.length(); // 입력받은 값의 길이
		
		if((n%2)!=0) { // 홀수면
			sb.append(str.charAt(n/2));
		}else { // 짝수일때
			sb.append(str.charAt((n/2)-1));
			sb.append(str.charAt(n/2));
		}
		
		
		
		return sb.toString();
	}
}
