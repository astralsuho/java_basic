package day7_1;

import java.util.Scanner;

public class Bmi {

	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bmi");
		System.out.println("키를 입력하세요");
		double to = scanner.nextDouble();
		System.out.println("몸무계를 입력하세요");
		double wh = scanner.nextDouble();
		double bmi =wh/(to*to)*10000;
		String bmi2 ="";
		
		if(bmi>=40) {
			bmi2 = "고도비만";
		}else if(bmi>=35) {
			bmi2 = "중등고 비만";
		}else if(bmi>=30) {
			bmi2 = "경도 비만";
		}else if(bmi>=25) {
			bmi2 ="과체중";
		}else if(bmi>=18.5) {
			
		}else{
			bmi2 ="저체중";
		}
		System.out.println(bmi+"\n"+bmi2);
	}
}
