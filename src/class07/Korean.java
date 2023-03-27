package class07; //package name

/**
 * 라이브러리 클래스
 */

public class Korean { //class start
	// 필드
	String nation = "대한민국"; // 국적이 동일 할 경우 값을 초기화 하여 진행
	String name;   // 성명
	String ssn;    //주민번호
	
	// 생성자
		public Korean( String name, String ssn) {
			this.name = name;     // 성명 초기화
			this.ssn = ssn;       // 주민번호 초기화
	
	
	// 생성자
	/*public Korean(String nation, String name, String ssn) {
		this.nation = nation; // 국적 초기화
		this.name = name;     // 성명 초기화
		this.ssn = ssn;       // 주민번호 초기화
		*/
	}
} //class end
