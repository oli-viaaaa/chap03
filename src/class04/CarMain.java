package class04; //package name

/*
 * 실행 클래스
 * 기본 생성자를 통한 객체 생성
 */

public class CarMain { //class start

	public static void main(String[] args) { //main start
		// 1. Car 객체 생성(생성자 호출 확인)
		Car myCar = new Car(); // 기본 생성자 호출
		Car myCar2 = new Car(); // 기본 생성자 호출
		
		System.out.println("객체의 주소 : " + myCar + " \n "+ myCar2);

	} //main end

} //class end
