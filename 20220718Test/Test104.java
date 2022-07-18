/*==============================================================================
               ■■■ 메소드 중복 정의(Method Overloading) ■■■
	  - 메소드 중복 정의(Method Overloading)이 가능한 형태와 불가능한 형태
  =============================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		
		// 우리가 보기엔 15번은 double d, 16번은 double e 메소드를 호출할 것 같지만
		// 자바 입장에서는 오른쪽부터 기준, 보기 때문에 똑같이 본다.
		print(3.14);
		double result = print(3.14);
	}

	public static void print() {};
	//public static void print() {};						//-- (X)
	public static void print(int i) {};
	//public static void print(int j) {};					//-- (X)
    public static void print(char c) {};					//-- 가능하지만 되게 조심해야함, 가급적 이런식의 메소드 오버로딩은 회피, 자동형변환규칙 check~!!!
	public static void print(int i, int j) {};		
	public static void print(double d) {};					//-- 되지만 조심, 형변환규칙 check~!!!
	//public static void print(double e) { return 10.0; };
    public static double print(double e) { return 10.0; };  //--(X) check~!!!
	
	
}