package day9;

import java.util.Scanner;

public class Calc {

	public void test() {
		
		Scanner scanner = new Scanner(System.in);
		
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			int res = 0;
			
			switch(op) {
			case "+" : res = a + b; break;
			case "-" : res = a - b; break;
			case "*" : res = a * b; break;
			case "/" : res = a / b; break;
			case "%" : res = a % b; break;
		
		}
			System.out.println(a+op+b+"="+res);
	}			
}
