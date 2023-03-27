package class13; //package name

/*
 * 메소드 연습용 Car 클래스를 사용하는 실행클래스
 */

public class CarMain { //class start
	public static void main(String[] args) { //main start
	
		// Car 객체 생성
		Car myCar = new Car(); //기본 생성자 호출
		// 클래스 객체 = new 생성자
		
		// 주유 메소드 setGas() 호출
		myCar.setGas(10); //10만큼 주유

		
		// 기름이 있을 경우 출발
		// isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if블록 실행
		if (myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			// 운행 run() 메소드 호풀
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요.");
	} //main end

} //class end
