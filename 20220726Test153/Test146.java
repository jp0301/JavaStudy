/*==============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - 자바에서 기본적으로 제공하는 주요 클래스들
  - Random 클래스
===============================================*/

/*
○ java.util.Random 클래스는
   
   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
//  3  5 12 24 31 41
//  1  2  8 36 41 42
//  4  9 12 13 22 30
//  5 10 13 14 22 40 
// 22 31 36 40 43 44
// 계속하려면 아무 키나 누르세요...

//로또 번호는 45번까지 있다.


import java.util.Random;
import java.util.Arrays;
class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num;

	// 생성자
	Lotto()
	{
		num = new int[6];
	}

	//getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt = 0;

		retry:
		while(cnt < 6)		// 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;		// (0~44) → 『+1』 → 1 ~ 45

			for(int i = 0; i < cnt; i++)
			{
				if(num[i] == n)
					continue retry;
			}
			num[cnt++] = n;
		} // end while()

		// 정렬 메소드 호출
		sorting();

	}// end start()


	/*
	// 정렬 메소드 정의
	public void arrSort()
	{	
		for(int i = 0; i < 5; i++)
		{
			for(int j = i+1; j < 6; j++)
			{
				if(num[i] > num[j])
				{	
					num[i] = num[i]^num[j];
					num[j] = num[j]^num[i];
					num[i] = num[i]^num[j];
				}
			}
		}
	} //end arrSort
	*/
	


	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}
}


public class Test146
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		//기본 5 게임
		for(int i = 1; i<=5; i++)
		{
			//로또 게임 수행
			lotto.start();
			//lotto.arrSort();
			
			//결과 출력
			for(int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}

	}
}
// 실행 결과

/*
   4   5   6  12  25  28
   1  26  31  34  37  43
   5  11  15  19  33  34
   8   9  16  21  27  43
   1   7  14  26  34  36
계속하려면 아무 키나 누르십시오 . . .
*/