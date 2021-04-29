package package5;

public class Ex27 implements Ex25{

	@Override
	public void method1(int dante) {
		int startGop = 5;
		int endGop = 9;
		for(int gop = startGop; gop <= endGop; gop++) {
			System.out.println(dante + " * " + gop + "=" + dante * gop);
			
		}
		
	}
	@Override
	public void method2() {
		int startDante = 4;
		int endDante = 8;
		for(int dante = startDante; dante <= endDante; dante++) {
			for(int gop = 1; gop <=9; gop ++) {
				System.out.println(dante + " * " + gop + "=" + dante * gop);
			}
		}
	}

}
