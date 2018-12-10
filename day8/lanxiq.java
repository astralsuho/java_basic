package day8;
import java.util.Scanner;
public class lanxiq {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴]\n"
								+ "1.계산기\n"
								+ "2.BMI\n"
								+ "3.달력\n"
								+ "4.성별\n"
								+ "5.성적표\n");
			String select = scanner.next();
			switch (select) {
			case "0": 
				System.out.println("정지");
				return;
			case "1": 
				System.out.println("계산기");
				break;
			case "2": 
				System.out.println("BMI");
				break;
			case "3": 
				System.out.println("달력");
				break;
			case "4": 
				System.out.println("성별");
				break;
			case "5": 
				
				break;
			default: break;
			}
		}

	}

}
