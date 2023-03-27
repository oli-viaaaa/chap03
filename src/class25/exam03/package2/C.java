package class25.exam03.package2;

import class25.exam03.package1.A;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;	 // O
		//a.field2 = 1;	 // X
		//a.field3 = 1;	 // X
		
		//메소드 호출
		a.method1();     // O
		//a.method2();   // X
		//a.method3();   // X
		
		
	}

}
