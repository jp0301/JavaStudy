/*==============================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - 자바에서 기본적으로 제공하는 주요 클래스들
  - StringBuffer 클래스
===============================================*/

/*
○ StringBuffer 클래스

   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다.

   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

	
   // StringBuilder
   또한, JDK 1.5 이후부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
   가장 큰 차이점은 multi-thread unsafe 라는 점이다.
   // StringBuffer = multi-thread safety~!!!
   thread = 기본적으로 작업들을 처리하는 단위
   즉, Syncronization 이 없기 때문에
   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
   StringBuilder 를 사용하는 것이 성능을 향상시킬 수 있다.
	
*/

public class Test138
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");

		System.out.println(str1 == str2);
		//--==>> false
		System.out.println(str1.equals(str2));
		//--==>> true
		//StringBuffer의 equals 메소드

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		//--==>> false
		System.out.println(sb1.equals(sb2));	// check~!!! 안에 내용물의 크기 비교를 하는 것이 아니다.
		//--==>> false
		
		System.out.println("-----------------------------------------");

		System.out.println(sb1);
		//--==>> korea //StringBuffer를 출력
		
		System.out.println(sb1.toString());
		//--==>> korea //String 출력

		System.out.println(sb1.toString().equals(sb2.toString()));
		// true
		//String 의 equals 메소드

		System.out.println("-----------------------------------------");

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer 기본 생성자 호출(인스턴스 생성 과정)
		//   기본적으로 생성되는 버퍼의 크기는 『16』


		// capacity()
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 16


		///////////////////////////////////////////////////////////////


		System.out.println(sb3);
		//--==>> 無

		/*
		String name ="박원석";
		name += "조영관";
		name += "김모씨";
		name += "최모씨";

		System.out.println(name);
		//--==>> 박원석조영관김모씨최모씨
		*/

		sb3.append("seoul");					// sb += "seoul";
		sb3.append("korea");					// sb += "korea";
		sb3.append("우리나라");					// sb += "우리나라";
		sb3.append("대한민국");					// sb += "대한민국";

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea우리나라대한민국
		//		 seoulkorea우리나라대한민국
        
		//버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34


		///////////////////////////////////////////////////////////////


		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.printn(sb3.toLowerCase());		
		//--==>> 에러 발생(컴파일 에러)

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA우리나라대한민국
		System.out.println(sb3.toString().toLowerCase());
		//--==>> seoulkorea우리나라대한민국


		// seoulkorea우리나라대한민국

		// ○ 대상 문자열(sb3) 중 seoul 앞에
		//    "한국" 이라는 문자열 추가
		//    → 한국seoulkorea우리나라대한민국
		sb3.insert(0, "한국");
		System.out.println("seoul 앞에 『한국』 추가 : " + sb3.toString());
		//--==>> seoul 앞에   추가 : 한국seoulkorea우리나라대한민국


		// ○ 대상 문자열(sb3) 중 korea 문자열 뒤에
		//    "사랑" 이라는 문자열 추가
		//    단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 않고...
		//    → 한국seoulkorea우리나라대한민국
		
		//sb3.insert(sb3.lastIndexOf("우"), "사랑");
		//System.out.println("korea 뒤에 『사랑』 추가 : " + sb3.toString());

		// 테스트 ①
		System.out.println(sb3.toString());
		//--==>> 한국seoulkorea우리나라대한민국

		// 테스트 ②
		//sb3.insert(12, "사랑");
		//System.out.println("korea 뒤에 『사랑』 추가 : " + sb3.toString());
		//--==>> korea 뒤에 『사랑』 추가 : 한국seoulkorea사랑우리나라대한민국
		
		// 테스트 ③
		// sb3.indexOf("korea");
		System.out.println(sb3.indexOf("korea"));
		//--==>> 7

		// 테스트 ④
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "사랑"));
		//--==>> 한국seoul사랑korea우리나라대한민국
		
		// 테스트 ⑤
		//sb3.insert(sb3.indexOf("korea") + 5, "사랑");
		//System.out.println(sb3.toString());
		//--==>> 한국seoulkorea사랑우리나라대한민국

		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "사랑"));
		//--==>> 한국seoulkorea사랑우리나라대한민국

		// ○ 대상 문자열(sb3) 에서
		//    『"우리나라"』문자열 삭제
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국

		//sb3.indexOf("우") → 14
		//sb3.indexOf("대") → 18
		//sb3.delete(sb3.indexOf("우"),sb3.indexOf("대"));

		sb3.delete(sb3.indexOf("우리나라"), sb3.indexOf("우리나라") + "우리나라".length());
		System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국

		// ○ 대상 문자열(sb3)에서
		//    『"korea"』 이후 문자열 삭제(korea 포함)
		//    → 한국seoulkorea사랑대한민국 → 한국seoul

		//sb3.delete(7, 18);
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==>> 한국seoul


		///////////////////////////////////////////////////////////////

		// 버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34

		// 문자열(sb3)의 길이 확인
		System.out.println("문자열의 길이 : " + sb3.length());
		//--==>> 문자열의 길이 : 7

		// 버퍼 크기 조절
		// → 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		// trimToSize()
		sb3.trimToSize();

		// 버퍼 크기 조절 이후 버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 7
		

	}
}
