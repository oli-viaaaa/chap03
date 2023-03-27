package class04; //package name

/*
 * 라이브러리 클래스, 도메인 클래스
 * 기본 생성자 사용
 * 	- 아무런 저장값이 없는 텅빈 객체를 생성한다
 */

public class Car { //class start
	
	// 필드(멤버 변수, 인스턴스 변수)
	String model; // 모델명
	String color; // 색상
	
	/*
	 * 기본 생성자
	 * 	- 클래스의 이름과 동일하다
	 * 	- 반환타입이 없다
	 * 	- 매개변수가 없다
	 * 	- 개발자가 안만들면 컴파일러가 자동으로 바이트 코드 안에 만들어준다.
	 */
	
	public Car() {
		System.out.println("여기는 기본 생성자 입니다.");
	}

} //class end