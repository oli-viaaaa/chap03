package class07; //package name

public class KoreanMain { //class start
	public static void main(String[] args) { //main start
		// 첫번째 객체 생성
		Korean Kor1 = new Korean("홍길동","123456-7892837");
		
		//Korean 객체의 값 읽기
		System.out.println("국적      : "+Kor1.nation); // 한번에 수정 Alt+shift+R
		System.out.println("성명      : "+Kor1.name);
		System.out.println("주민번호 : "+Kor1.ssn);
		System.out.println();
		
		// 두번째 객체 생성
		Korean Kor2 = new Korean("김철수","951206-4687248");
		
		//Korean 객체의 값 읽기
		System.out.println("국적      : "+Kor2.nation);
		System.out.println("성명      : "+Kor2.name);
		System.out.println("주민번호 : "+Kor2.ssn);
		System.out.println();
		
		
		
		
		
		
	} //main end

} //class end
