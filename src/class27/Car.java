package class27;

/*
 * Car 클래스
 * getter/setter 메소드  구현하여 저장할 값 검증
 * get 메소드 : 값을 조회하는 메소드(값을 보여주는 메소드)
 * 	- 메소드 만드는 요령 : get + 필드이름(앞글자 대문자)
 * set 메소드 : 값을 저장하는 메소드
 * 	- 메소드 만드는 요령 : set + 필드이름(앞글자 대문자)
 */

public class Car {
	// 필드 선언
	private int speed;
	private boolean stop;
	
	// speed 필드의 값조회 (getter메소드)
	public int getSpeed() { //get 밖에서 보는 관점 속도 값을 밖에서 원함
		return speed;
	}
	
	// speed 필드에 값 저장(메소드명 : set + Speed)
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	// stop 필드의 값 조회(boolean 필드는 get 대신에 is 사용 가능)
	public boolean isStop() { //getStop사용해도 문제 없음
		return stop;
	}
	// stop 필드의 값 저장
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop==true)this.speed = 0;
	}

}
