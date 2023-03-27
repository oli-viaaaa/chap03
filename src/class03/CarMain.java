package class03; //package name

/*
 * 실행클래스
 * 	- 객체 생성과 필드의 사용(필드에 값 저장)
 * 	- 필드의 자료형이 가지는 기본 값으로 자동 초기화 된다.
 */

public class CarMain { //class start

	public static void main(String[] args) { //main start
		
		// Car 객체 생성
		// 클래스 명  참조변수 = new 클래스 명 
		Car myCar = new Car(); // 기본 생성자 호출
		
		// 필드의 초기값 읽기(접근할땐 (.도트 )연산자 사용) 
		// myCar = 필드 변수 ,타입변수, 객체
		System.out.println("모델명(String)   : " +myCar.model);
		System.out.println("색상명(String)   : " +myCar.color);
		System.out.println("속도명(int)      : " +myCar.speed);
		System.out.println("출발여부(boolean) : " +myCar.start);
		System.out.println("최대속도명(int)    : " +myCar.maxSpeed);
		System.out.println();
		
		// myCar 객체의 필드에 값 저장
		myCar.model = "제네시스";
		myCar.color = "다크블루";
		myCar.speed = 60;
		myCar.start = true;
		myCar.maxSpeed = 300;
		
		// myCar 객체에 저장한 필드값 조회하기
		System.out.println("모델명(String)   : " +myCar.model);
		System.out.println("색상명(String)   : " +myCar.color);
		System.out.println("속도명(int)      : " +myCar.speed);
		System.out.println("출발여부(boolean) : " +myCar.start);
		System.out.println("최대속도명(int)    : " +myCar.maxSpeed);
		

	} //main end

} //class end
