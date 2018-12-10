package day9;

import java.util.Scanner;

public class Bmi {
	public void tset() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 입력하세요");
		double hei = scanner.nextDouble();
		System.out.println("체중을 입력하세요");
		double wei = scanner.nextDouble();
		double bmi = wei /(hei*hei)*10000;{
		String bmi2 = "";	
			
		if(bmi>=40) {
		}else if(bmi>=35) {
			bmi2 ="고도 비만";
		}else if(bmi>=30){
			bmi2 = "중등도 비만";
		}else if(bmi>=25) {
			bmi2 = "경도 비만";
		}else if(bmi>=25) {
			bmi2 = "과체중";
		}else if(bmi>=18.5) {
			bmi2 ="정상";
		}else{
			bmi2 = "저체중";

			
		}
			System.out.println(bmi+bmi2);
		}
	}
}
		