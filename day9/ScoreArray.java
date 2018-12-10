package day9;

import java.util.Scanner;

public class ScoreArray {
	public void test() {
		//점수 3개 입력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 3개를 입력하시오");
		int[] scores = new int[3];
		for(int i =0; i<scores.length;i++) {
			scores[i] = scanner.nextInt();
		}
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int[] arr = {a,b,c};
		 
		String res = "";
		
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				res += arr[i]+",";
			}else{
				res += arr[i];
			}
		}
		
		System.out.println(res);		
			
	}
	public static void main(String[] args) {
		ScoreArray a = new ScoreArray();
		a.test();
	}
	
}

