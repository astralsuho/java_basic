package day9;

import java.util.Scanner;

//import day8.Bmi;
import day8_1.For; 

public class Main {

	public static void main(String[] args) { 
		Scanner scanner =new Scanner(System.in);
		while (true) {
			System.out.println("[메인]\n"
					+ "1.계산기\n"
					+ "2.BMI\n"
					+ "3.for문\n"
					+ "4.NameArreay");
			String select =scanner.next();
		
		switch (select) {
		
		case "1" : 
			System.out.println("1.계산기");
			Calc av = new Calc();
			av.test();
			break;
		case "2" :
			System.out.println("2.BMI");
			Bmi ai	 = new Bmi();
			ai.tset();
		case "3" :
			System.out.println("3.for");
			For ab = new For();
			ab.test();
		case "4" :	
			System.out.println("4.NameArreay");
			NameArreay ac = new NameArreay();
			ac.test();
			
		
		}
		
			
		
		
		
		}
		}

	}

