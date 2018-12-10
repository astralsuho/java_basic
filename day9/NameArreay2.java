package day9;

public class NameArreay2 {

	public void test() {
		
		String[] names = {"홍길동","장영실","유관순"};
		String s ="";	
		System.out.println("뱅열의 길이 : name");
	
	for(int i=0;i<3;i++) {
		System.out.println("i값의변화 :"+i);
		s += names[i]+",";
	}	
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		NameArreay2 aa = new NameArreay2();
		aa.test();
	}
}
