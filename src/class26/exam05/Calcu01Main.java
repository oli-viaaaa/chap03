package class26.exam05;

public class Calcu01Main {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		double x1 = 10.5;
		double y1 = 20.0;
		
		// 계산기 객체 생성
		Calcu01 cu01 = new Calcu01();
		
		
		// 정수 합산
		int intsum = cu01.sum(x, y);
		
		// 실수 합산
		double doublesum = cu01.sum(x1, y1);

		System.out.printf("정수 %d와 %d의 합산 결과는 %d입니다.",x,y,intsum);
		// System.out.printf("실수 %.1f와 %.1의 합산 결과는 %.1f입니다.",x1,y1,doublesum);
		
	}

}
