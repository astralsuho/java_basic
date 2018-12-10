package day8_1;

import java.util.Scanner;

public class For {
	public void test() {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 10까지 더하기");
	
		int sum = 0;
		String iu = "";
	
		for(int i=1;i<=10;i++) {
			if(i!=10) {
				iu += i+"+"; // +는 스켄값을 보여주기위해
			}else{
				iu += i+"=";
			}
			sum += i;
		}
		System.out.println(iu+sum);
	}
}
