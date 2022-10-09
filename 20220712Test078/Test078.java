/*============================================================
               ■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor) 와 초기화 블럭(Initialized Block)
  ===========================================================*/

public class Test078
{
	// 수행할 수 없음
	/*
	int n; 이미 이상태에서 0으로 초기화가 되어있다.
	int m;
	
	n = 100; 그래서 이렇게 별도의 대입 연산이기에 초기화가 아니다.
	m = 200;
	*/

	// 수행 가능
	// 클래스의 영역 안에서는 선언과 동시에 초기화되는 것은 가능하다.
	/*
	int n = 100;
	int m = 200;
	*/


	int n;
	int m;
	
	// 초기화 블럭(Initialized Block) - 특별하지 않은 범용적인 디폴트 값을 구성하는데 많이 쓰인다.
	{
		n=10;
		m=20;
		System.out.println("초기화 블럭 실행...");
	}


	// 생성자(Constructor) → 초기화블럭이 코드를 먼저 수해했다 하더라도
	//						  최종적으로 해당 멤버들의 초기화 값을 결정하게 되는 것은
	//						  하하하... 생성자~!!!
	Test078()
	{
		n = 100;
		m = 200;
		System.out.println("생성자 실행...");
	}

	
	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수 있는 생성자 실행...");
	}


	// 멤버 출력 메소드 정의
	void write()
	{
		System.out.println("n:" + n + ", m:" + m);
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		
		Test078 ob2 = new Test078(3,4);
		ob2.write();		

	}
}

// 실행 결과
/*
초기화 블럭 실행...
생성자 실행...
n:100, m:200
초기화 블럭 실행...
매개변수 있는 생성자 실행...
n:3, m:4
계속하려면 아무 키나 누르십시오 . . .
*/