package day6;
import java.util.Scanner;
public class Daan1 {
	public static void main(String[] args) {
	
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("메뉴\n0.종료\n1.계산기\n2.BMI");
			String select = scanner.next();
			
			switch(select) {
			case"0" :
				System.out.println("종료");
				return;
				
			case"1" :
				System.out.println("계산기");
			int a =scanner.nextInt();
			String op = scanner.next();
			int b =scanner.nextInt();
			int result = 0;
			
			switch(op) {
			case"+" : result = a + b;break;
			case"-" : result = a - b;break;
			case"*" : result = a * b;break;
			case"/" : result = a / b;break;
			case"%" : result = a % b;break;
			
			}			
		System.out.println(a+op+b+"="+result);
				
			}
			
			
		}
}
}
