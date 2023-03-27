package class26.exam04;

/*
 * 라이브러리 클래스
 * 	- 필드
 * 	- 기본생성자 public Stuent(){}
 * 	- 오버로딩 생성자
 */

public class Student {

	// 필드, 멤버변수, 인스턴스 필드
	public String name;
	public int age;
	public char gender;
	public String phone;
	public int score;

	// 기본 생성자(객체 초기화)
	public Student() {
	}

	// 오버로딩 생성자(주어진 파라미터로 객체 초기화)
	public Student(String name, int age, char gender, String phone, int score) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.score = score;
	}

	public String showStudentInfo() {
		String str = this.name +"\t"+ this.age + "\t" +  this.gender + "\t" + this.phone + "\t" + this.score;
		return str;
	}

}
