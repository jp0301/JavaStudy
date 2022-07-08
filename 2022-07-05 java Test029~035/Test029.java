 /*====================================
      ■■■ 연산자(Operator) ■■■
      - 조건 연산자 == 삼항 연산자
   ====================================*/

// 사용자로부터 임의의 문자 하나를 입력받아서
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르세요...

/*

ch

알파벳대문자 ? 알파벳소문자로변환 : (알파벳소문자 ? 알파벳대문자로변환 : 있는그대로 );

result

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{

		// 내 해결풀이 -------------------------------------------------------------------------------------------------------
		
		/*
		char ch;
		char numResult;

		System.out.print("한 문자 입력 : ");
		ch = System.in.read();
		
		numResult = ((ch >= 65) && (ch <= 90)) ? (char)(ch + 32) : ((ch >= 97) && (ch <=122)) ? (char)(ch - 32) : (char)ch;
		
		System.out.printf("%c →%c\n", ch, numResult);
		*/


		// 함께한 풀이 -------------------------------------------------------------------------------------------------------
		
		/*
		char temp;

		System.out.print("한 문자 입력: ");
		temp = (char)System.in.read();

		//System.out.println("입력받은 값 확인 : " + temp);

		//대문자? 대문자아님?
		
		String result = temp >= 65 && temp <= 90 ? "대문자": "대문자아님";
		System.out.println("결과 : " + result);
		
		String result = temp >= 'A' && temp <= 'Z' ? "대문자": "대문자아님";
		System.out.println("결과 : " + result);
		*/

		
		// 대문자 → 소문자
		//'A'(65) → 'a'(97) ==> +32
		//'B'(66) → 'b'(98) ==> +32
		//        :


		// 소문자 → 대문자
		//'a'(97) → 'A'(65) ==> -32
		//'b'(98) → 'B'(66) ==> -32
        //        :

		char ch, result;

		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		//result = () ? ( ) : (  );
		//result = (입력값대문자) ? (소문자로변환) : ((입력값소문자 ? 대문자로변환 : 그대로));
		result = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		
		// Q (→ 81)
		// result = (81 >= 65 && ch <= 'Z') ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = (true && ch <= 'Z') ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = (true 65 && 81 <= 90) ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = (true && true) ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? (char)(ch + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? (char)(81 + 32) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? (char)(113) : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = true ? ('q') : (  (ch >= 97 && ch <= 122) ? (char)(ch - 32) : ch  );
		// result = 'q';


		System.out.printf("%c → %c\n", ch, result);
	}
}


// 실행 결과

/*
한 문자 입력 : E
E → e
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : a
a → A
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : 9
9 → 9
계속하려면 아무 키나 누르십시오 . . .
*/