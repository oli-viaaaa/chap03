package class17;

/*
 * 실행 클래스
 */

public class CalculatorMain { //class start

	public static void main(String[] args) {
		Calculator clac = new Calculator(); //Calculator 객체 생성
		
		int radius = 10; //반지름
		double area = clac.area(radius); //인스턴스 객체에 접근
		System.out.printf("원의 반지름이 %d일때 원의 넓이는 %.2f입니다.",radius,area);
		System.out.println();
		
		Calculator calc2 = new Calculator();
		radius = 20;
		area = calc2.area(radius);
		System.out.printf("원의 반지름이 %d일때 원의 넓이는 %.2f입니다.",radius,area);

	} //main end

} //class end
