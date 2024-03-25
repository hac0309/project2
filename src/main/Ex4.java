package main;

/*
	정수 자료형
*/
public class Ex4 {

	public static void main(String[] args) {
		
		short s = 10;
		byte b = 10;
		int i = 10;
		long l = 10;
		
//		l = 12345678900; // 에러 나는 이유 1)값의 범위를 벗어나거나 2)식별자를 누락함
		l = 12345678900l; // 식별자 l을 넣어주니 에러가 사라짐
		// long 타입에 값을 담을 때, int형 범위를 넘어가면 식별자를 달아줘야 함
		
		System.out.println(s + b); // 서로 다른 타입이어도 가능
		
		s = 200; // 범위에 벗어나는 값을 대입하면 에러 발생
	}

}
