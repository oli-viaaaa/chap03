package class18;

/*
 * 정적 멤버 사용하는 실행 클래스
 */

public class CalculatorMain { //class start
	public static void main(String[] args) {
		
		//Calculator clac = new Calculator(); //Calculator 객체 생성
		int radius = 10; //반지름
		double area = Calculator.area(radius); //객체 생성 없이 접근
		System.out.printf("원의 반지름이 %d일때 원의 넓이는 %.2f입니다.",radius,area);
		System.out.println();
		
		//Calculator calc2 = new Calculator();
		radius = 20;
		area = Calculator.area(radius); //객체 생성 없이 접근
		System.out.printf("원의 반지름이 %d일때 원의 넓이는 %.2f입니다.",radius,area);

	} //main end

} //class end
