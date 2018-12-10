package day7_1;

import java.util.Scanner;

public class Calc1 {

	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산기");
		 int ar = scanner.nextInt();
		 String op = scanner.next();
		 int br = scanner.nextInt();
		 int res = 0; 
		 
		 switch (op) {
		 case "+" : res = ar + br; break;
		 case "-" : res  =ar - br; break;
		 case "*" : res =ar * br; break;
		 case "/" : res =ar / br; break;
		 case "%" : res = ar %br; break;
		 
		 
				}
		 System.out.println(ar+op+br+"="+res);
	}
}
