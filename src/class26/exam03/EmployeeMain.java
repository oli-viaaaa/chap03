package class26.exam03;

import java.util.Iterator;

/*
 * 실행 클래스
 * 객체 생성 방식
 * 	1. 빈객체 생성 후 값 저장
 * 	2. 객체 생성하면서 초기값 전달(값 저장)
 */

public class EmployeeMain {

	public static void main(String[] args) {
		// 1. 빈객체 생성(클래스 변수 = new 클래스)
		Employee em = new Employee();

		// 1.1 빈객체의 필드에 값 할당
		em.empNo = 2005031002;
		em.eName = "배준섭";
		em.position = "과장";
		em.salary = 500;

		// 1.2 객체의 정보 조회(출력)
		System.out.println("em.empNo    : " + em.empNo);
		System.out.println("em.eName    : " + em.eName);
		System.out.println("em.position : " + em.position);
		System.out.println("em.salary   : " + em.salary);
		System.out.println();

		// 2. 오버로딩 생성자 활용한 객체 생성
		// 2021010003, "김홍철", "사원", -250
		Employee em2 = new Employee(2021010003, "김홍철", "사원", -250);

		// 2.2 객체의 정보 조회(출력)
		System.out.println("em2.empNo    : " + em2.empNo);
		System.out.println("em2.eName    : " + em2.eName);
		System.out.println("em2.position : " + em2.position);
		System.out.println("em2.salary   : " + em2.salary);
		System.out.println();
		// System.out.println(em2.empNo + " " + em2.eName + " " + em2.position + " " +
		// em2.salary );

		// 3. 객체 배열
		System.out.println("객체 배열을 통한 사원 정보 조회");
		// Employee 배열 3개짜리
		Employee[] emps = new Employee[3]; // Employee객체만 저장 가능

		// 2023010001, "김수희", "대리", 310
		// 2023010001, "박미선", "사원", 280
		// 2023010001, "최무림", "과장", 400

		// 3.1 첫번째 사원 정보 출력
		emps[0] = new Employee(2023010001, "김수희", "대리", 310);
		System.out.println("empNo1    : " + emps[0].empNo);
		System.out.println("eName1    : " + emps[0].eName);
		System.out.println("position1 : " + emps[0].position);
		System.out.println("salary1   : " + emps[0].salary);
		System.out.println();

		// 3.2 두번째 사원 정보 출력
		emps[1] = new Employee(2023010001, "박미선", "사원", 280);
		System.out.println("empNo2    : " + emps[1].empNo);
		System.out.println("eName2    : " + emps[1].eName);
		System.out.println("position2 : " + emps[1].position);
		System.out.println("salary2   : " + emps[1].salary);
		System.out.println();

		// 3.3 세번째 사원 정보 출력
		emps[2] = new Employee(2023010001, "최무림", "과장", 400);
		System.out.println("empNo3    : " + emps[2].empNo);
		System.out.println("eName3    : " + emps[2].eName);
		System.out.println("position3 : " + emps[2].position);
		System.out.println("salary3   : " + emps[2].salary);
		System.out.println();
		
		// for 문을 활용해서 개체를 일괄적으로 출력하라
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].empNo + " " + emps[i].eName + " " + emps[i].position + " " + emps[i].salary );
		}
		System.out.println();
		
		// 향상된 for문을 활용해서 개체를 일괄적으로 출력하라
		// 배열에서 하나씩 꺼내옴 for(타입변수, employee : emps){}
		for (Employee em3 : emps) {
			System.out.println(em3.empNo + " " + em3.eName + " " + em3.position + " " + em3.salary);
		}
		System.out.println();
		
		// 전 사원들의 급여 총액(향상된 for문 사용)
		int sum = 0;
		for (Employee employee : emps) {
			sum += employee.salary;
		}
		System.out.printf("전 사원의 급여 총액은  %d 입니다.",sum);
		
		
		
		

	} // main end

} // class end
