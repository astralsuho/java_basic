package day9;

import java.util.Scanner;

public class Cao2 {

	public void test() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수 몇명입니까?");
		int count =scanner.nextInt();
		String[] names =new String[count];
		int[] scores = new int[count];
		int iter =0;
		while(true) {
			System.out.println("[종료0 , 진행1 ] 학생 이름과 점수를 입력하세요");
			String flag = scanner.next();
			if(!flag.equals("0") || iter != count) {
				names[iter] = scanner.next();
				scores[iter] = scanner.nextInt();
				iter++;
			}else{	
			System.out.println("종료");
			for(int i=0;i<names.length;i++) {
				
				
			}
			
			}			
			
			
		}
		
		}
		
	public static void main(String[] args) {
		Cao2 cao = new Cao2();
		cao.test();
	}

}
