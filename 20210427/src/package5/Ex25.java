package package5;

public interface Ex25 {
	//추상 메서드
	
	void method1(int dante);
	//default 메서드
	default void method2() {
		System.out.println("MyInterface-method2 실행");
	}

}
