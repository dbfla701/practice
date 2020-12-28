package com.min.edu;

public class Test3 {
	
	public static void main(String[] args) {
		Test3.solution();
		System.out.println(Test3.solution());
	}
	
	public static int solution() {
	    int max = 0;
	    int[][] triangle = {{1}, 
	    					{34, 50},
	    					{6,38,10},
	    					{42, 43, 74, 54}}; // [4][4]
	    int n = triangle.length; // 4
	    
	    for (int i = 1; i < n; i++) {
	        for (int j = 0; j <= i; j++) {
	        	
	            if (j == 0) // 맨 왼쪽부분 1, 34, 6, 42
	                triangle[i][j] += triangle[i - 1][j];
	            
	            else if (i == j) // 맨 오른쪾 부분 1, 50, 10, 54
	                triangle[i][j] += triangle[i - 1][j - 1];
	            
	            else // 파란색 삼각형 부분
	                triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
	 
	            if (i == triangle.length - 1)
	                max = Math.max(max, triangle[i][j]);
	        }
	    }
	    return max;
	}
}
