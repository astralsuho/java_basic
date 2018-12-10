package day7_1;

import java.util.Scanner;

public class ForDemo {

	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터10까지 입력하세요");
		int res = 0;
		String aa = "";
		
		for (int i =1; i<10; i++) {
			res += i;
			aa +=i;
			System.out.println(i+" "+res);
		}
			
		
}
}
