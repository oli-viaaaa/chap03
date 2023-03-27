package class05; // package name

/*
 * 라이브러리 클래스, 도메인 클래스
 * 또다른 생성자를 만듦 - 기본 생성자 안만들어짐
 */

public class Car { //class start
	
	// 필드(멤버 변수)
	String color;
	Car myCar3 = new Car(color);
	
	// 또다른 생성자 //파라미터 존재 기본 생성자x
	Car(String co){
		color = co;
		System.out.println("여기는 또다른 생성자입니다.");
	}

} // class end
