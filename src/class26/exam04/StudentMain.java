package class26.exam04;

public class StudentMain {

	public static void main(String[] args) {
		// 첫번째 객체 생성
		Student[] arrStd = new Student[5];
		arrStd[0] = new Student("김홍철", 23, '남', "010-2340-1233", 85);
		arrStd[1] = new Student("정순미", 24, '여', "010-2340-1233", 70);
		arrStd[2] = new Student("이만섭", 22, '남', "010-2340-1233", 96);
		arrStd[3] = new Student("최주호", 20, '남', "010-2340-1233", 85);
		arrStd[4] = new Student("고미림", 26, '여', "010-2340-1233", 77);

		int sum = 0;
		double avg = 0.0;
		System.out.println("============================================================");
		System.out.println(" name      age       gender            phone           score");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < arrStd.length; i++) {
			System.out.println(arrStd[i].name + "\t   " + arrStd[i].age + "\t\t" + arrStd[i].gender + "\t    "
					+ arrStd[i].phone + "\t" + arrStd[i].score);
			sum = sum + arrStd[i].score;
		}
		System.out.println("=============================================================");

		avg = (sum * 1.0) / arrStd.length;
		System.out.println("총인원 : " + arrStd.length);
		System.out.printf("평균점수 : %.2f \n", avg);

		int max = 0;
		String maxName = " ";
		for (int i = 0; i < arrStd.length; i++) {
			if (arrStd[i].score > max) {
				max = arrStd[i].score;
				maxName = arrStd[i].name;
			}
		}
		System.out.println("최고 점수는 : " + max + "점 이며 최고 점수 학생은 " + maxName + "입니다.");

		for (Student std : arrStd) {
			System.out.println(std.showStudentInfo());
			sum += std.score;
			if (std.score > max) {
				max = std.score;
				maxName = std.name;
			}
		}

	}

}
