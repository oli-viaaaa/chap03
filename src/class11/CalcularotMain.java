package class11;

/**
 * Calcularot 클래스를 객체로 생성해서 사용하는 실행클래스
 * 클래스가 가진 메소드는 클래스를 객체로 생성해야 사용할 수 있다.
 */

public class CalcularotMain {
	public static void main(String[] args) {
		
		// 1. 계산기(Calcularot) 객체 생성
		Calcularot myCalc = new Calcularot();
		
		// 2. 계산기 전원 켜기 powerOn() 메소드 호출
		// 전달 받는 값이 없으므로 메소드만 호출하면 됨
		myCalc.powerOn();
		
		// 3. 덧셈
		// 3.1 덧셈 메소드 호출하면서 인자값으로 5와 6을 전달 
		// 3.2 덧셈 결과를 반환 받아 result1 변수에 대입
		int result1 = myCalc.plus(5, 6);
		System.out.println("덧셈 결과 : "+result1);
		
		// 전달할 값을 저장할 변수 선언
		int x = 10;
		int y = 4;
		
		// 4. 나눗셈
		// 4.1 나눗셈에 사용할 숫자 변수 x와 y값 제공
		// 4.2 나눗셈 결과를 리턴받아 result2 변수에 대입
		double result2 = myCalc.divide(x, y);
		System.out.println("나눗셈 결과 : "+result2);
		
		// 5. 곱셈 : multiplication
		// 5.1 반환값이 없는 메소드로 메소드 내에서 곱셈 결과를 직접 출력하세요
		 myCalc.multipication(x, y);
		
		// 6. 뺄셈 : subraction
		// 6.1  반환값이 있는 메소드
		 result1 = myCalc.subraction(x, y);
	     System.out.println("뺄셈 결관 : " + result1);
		
		// 7. 계산기 전원 끄기
		// 리턴값이 없는 powerOff() 메소드 호출
		myCalc.powerOff();

	}

}
