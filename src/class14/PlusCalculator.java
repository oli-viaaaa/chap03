package class14; //package name

/*
 * 메소드 오버로딩 연습 라이브러리 클래스 
 */

public class PlusCalculator { //class start
	
	// 정수 덧셈 메소드(반환타입)
	int plus(int x, int y) {
		int result = x+y;
		return result; //리턴값 저장
	}
	
	// 실수 메소드
	double plus(double x, double y) {
		double result = x + y;
		return result; //리턴값 저장
	}
} ///class end
