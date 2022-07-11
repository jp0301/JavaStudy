/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
  =====================================*/

// ※ Test071.java 파일과 세트~!!!

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java
// BufferedReader 의 readLine()

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xxx

// >> 반지름이 xxx 인 원의
// >> 넓이 : xxxx.xx
// >> 둘레 : xxxx.xx
// 계속하려면 아무 키나 누르세요....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// 주요 속성(데이터) → 멤버 변수
	int r;
	final double PI = 3.141592;
	
	void input() throws IOException
	{
		// 여기다 작성하는 이유는
		// 그냥 class에다 작성해버리면
		// Test071에서 인스턴스를 생성했을 때 사용하지도 않는데 메모리를 사용하게된다.
		// 따라서 input() 안에서 작성하여 입력받을 때만.
		// "화장실에 볼일을 볼 때 세면대에 물이 틀어져 있는 느낌" 과
		// "세수를 할때만 물을 트는 것의 차이"

		// 단, class에서 BufferedReader br; 하고
		// input안에서 br = new BufferedReader(new InputStreamReader(System.in));
		// 을 한 것은 다른 메소드에서도 사용할 때는 고려해볼만 하지만...
		// 즉, 이렇게는 다른 메소드에서도 버퍼리더가 쓰일 때 사용한다.

		// 클래스에서 작성하는 것은 가급적이면 하지 말자!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	double calArea()
	{
		return r * r * PI;
	}

	double calLength()
	{
		return r * 2 * PI;
	}

	void print(double a, double l)
	{
		System.out.printf(">> 반지름이 %d 인 원의\n", r);
		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", l);
	}
	


}