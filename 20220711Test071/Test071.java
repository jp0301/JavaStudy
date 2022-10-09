/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
  =====================================*/

// ※ CircleTest.java 파일과 세트~!!!

import java.io.IOException;

public class Test071
{
	// input() 메소드에서 throws IOException 예외처리를 하면
	// input 메소드 밖으로 던지면서
	// main() 메소드로 던져버린 것이기 때문에 다시 한번 던져줘야하기 때문에
	// 한번 더 예외처리를 해준다.

	public static void main(String[] args) throws IOException
	{
		// CircleTest 클래스 기반 인스턴스 생성
		// CircleTest 인스턴스 생성
		// CircleTest 객체 생성
		CircleTest ob = new CircleTest();
		

		ob.input();
		
		double area = ob.calArea();
		double length = ob.calLength();
        
		ob.print(area, length);
	}
}

// 실행 결과

/*
반지름 입력 : 25
>> 반지름이 25 인 원의
>> 넓이 : 1963.50
>> 둘레 : 157.08
계속하려면 아무 키나 누르십시오 . . .
*/