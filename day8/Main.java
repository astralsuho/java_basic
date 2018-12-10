package day8;

import java.util.Scanner;

import day6.new2;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴]\n"
									+ "1.계산기\n"
									+ "2.BMI\n"
									+ "3.달력\n"
									+ "4.성별체크");
			String select = scanner.next();
			switch (select) {
			case "0": System.out.println("종료");return;
			
			case "1": 
				Calc a1 = new Calc();  						
				break;
				
			case "2":
				Bmi bmi =new Bmi();		
				break;
						
			case "3":
				MyCanlender canlender = new MyCanlender(); 
				break;
				
			case "4": 
				GenderCheker cheker = new GenderCheker();
				break;
			
			case "5":
				Grade grade = new Grade();
				break;

			
			default:
				break;
			}
		}
		
	
		// TODO Auto-generated method stub

	}
}
