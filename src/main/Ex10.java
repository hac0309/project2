package main;

public class Ex10 {

	public static void main(String[] args) {
		
		// 정수형의 강제 형변환
		int i = 1000;
		
		// 강제형변환이 발생할때는 자료형을 정확히 명시해야함
		byte b = (byte) i;
		System.out.println(b);
		
		// 실수형의 강제 형변환
		double d = 1.2;
		float f = (float)d; // 소수 부분이 날아가서 정수값인 1이 남음
		
		// 정수형과 실수형의 강제형변환
		int i2 = (int) f;
		System.err.println(f);
		System.out.println(i2);
		
	}
}
