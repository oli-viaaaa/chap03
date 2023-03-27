package class26.exam07;

/*
 * 실행 클래스
 */

public class TimeMain {

	public static void main(String[] args) {
		// Time 객체 생성
		Time t = new Time();
		// t.hour = 25; private로 되어있어 사용 불가능
		t.setHour(25);
		t.showTime();
	}

}
