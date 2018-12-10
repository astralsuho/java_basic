package day9;

public class NameArreay {

	public void test() {
		String s ="";
		String[] names = new String[3];
		names[0] = "홍길동";
		names[1] = "홍실";
		names[2] = "홍동";
			//names[3] = "길동";
	String res ="";
	
	for(int i=0;i<3;i++) {
		System.out.println("i값의변화 :"+i);
		res += names[0]+",";
	}	
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		NameArreay aa = new NameArreay();
		aa.test();
	}
}
