/*==============================================================================
               ���� �޼ҵ� �ߺ� ����(Method Overloading) ����
	  - �޼ҵ� �ߺ� ����(Method Overloading)�� ������ ���¿� �Ұ����� ����
  =============================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		
		// �츮�� ���⿣ 15���� double d, 16���� double e �޼ҵ带 ȣ���� �� ������
		// �ڹ� ���忡���� �����ʺ��� ����, ���� ������ �Ȱ��� ����.
		print(3.14);
		double result = print(3.14);
	}

	public static void print() {};
	//public static void print() {};						//-- (X)
	public static void print(int i) {};
	//public static void print(int j) {};					//-- (X)
    public static void print(char c) {};					//-- ���������� �ǰ� �����ؾ���, ������ �̷����� �޼ҵ� �����ε��� ȸ��, �ڵ�����ȯ��Ģ check~!!!
	public static void print(int i, int j) {};		
	public static void print(double d) {};					//-- ������ ����, ����ȯ��Ģ check~!!!
	//public static void print(double e) { return 10.0; };
    public static double print(double e) { return 10.0; };  //--(X) check~!!!
	
	
}