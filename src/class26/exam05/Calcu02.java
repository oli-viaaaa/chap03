package class26.exam05;

/*
 * [메소드 오버로딩]
 * 계산기 라이브러리 클래스
 * 동일한 이름의 메소드를 매개변수 타입, 갯수, 순서를 달리하여 정의함
 * 매개변수의 형태에 따라서 알맞은 메소드가 자동으로 호출된다.
 */

public class Calcu02 {

	public int add(int a, int b) {
		return a + b;
	} 

	public long add(int c, long d) {
		return  (c + d);
	}

	public long add(long e, int f) {
		return (e + f);
	}

	public long add(long g, long h) {
		return (g + h);
	}

	
	int add(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
	
	
}
