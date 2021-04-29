package package02;

public class Ex12Test {

	public static void main(String[] args) {
		Ex09 ex;
		Ex08 ex1 = new Ex09();
		ex = (Ex09)ex1;
		ex.num1 = 300;
		ex.num2 = 500;
		ex.add();
		ex1.add();
		
		

	}

}
