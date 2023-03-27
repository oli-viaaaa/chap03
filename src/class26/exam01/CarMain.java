package class26.exam01;

public class CarMain {

	public static void main(String[] args) {
		// 첫번째 객체 생성(빈 객체 생성)
		//Car car = new Car();
		
		/* 멤버 변수(필드)에 직접 접근해서 값 저장
	    car.maker = "현대차";
	    car.model = "그랜저";
	    car.cc = 2000;
	    car.color = "white";
	    car.price = 30000000;
	    car.maxSpeed = 250;
	    car.speed = -120; //잘못된 값을 객체의 필드에 직접 넣고있음
	    
	    // 첫번째 자동차 객체의 값 출력
	    System.out.println(car.maker);
	    System.out.println(car.model);
	    System.out.println(car.cc);
	    System.out.println(car.color);
	    System.out.println(car.price);
	    System.out.println(car.maxSpeed);
	    System.out.println(car.speed);
	    System.out.println();
*/
		
		// 두번쩨 자동차 객체 생성(생성자 호출하면서 값 저장)
	    Car car2 = new Car("기아차", "K9", 3000, "black", 50000000, 300, 150);

		
	    // 두번째 자동차 객체의 값출력
	    System.out.println(car2.maker);
	    System.out.println(car2.model);
	    System.out.println(car2.cc);
	    System.out.println(car2.color);
	    System.out.println(car2.price);
	    System.out.println(car2.maxSpeed);
	    System.out.println(car2.speed);
	    System.out.println();

	
		
		// 자동차 객체의 값 출력하는 또 다른 방법(showCarInfo 메소드)
		// 첫번쩨 자동차 객체의 값 출력
		//car.showCarInfo();
		System.out.println();
		
		// 두번째 자동차 객체의 값 출력
		car2.showCarInfo();
		
	}

}
