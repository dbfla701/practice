package coding.practice;

public class P1 {
	
	int max;
	int answer;
	public static void main(String[] args) {
		
	}
	
	public int q1() {
		int[] n = {81,81,81,83,83,75,64,99};
		int[] count = new int[100];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < count.length; j++) {
				count[j]=i;
				count[j]++;
			}
		}
		
		return 0;
	}


}
