/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
  =====================================*/

// �� Test071.java ���ϰ� ��Ʈ~!!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java
// BufferedReader �� readLine()

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xxx

// >> �������� xxx �� ����
// >> ���� : xxxx.xx
// >> �ѷ� : xxxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	// �ֿ� �Ӽ�(������) �� ��� ����
	int r;
	final double PI = 3.141592;
	
	void input() throws IOException
	{
		// ����� �ۼ��ϴ� ������
		// �׳� class���� �ۼ��ع�����
		// Test071���� �ν��Ͻ��� �������� �� ��������� �ʴµ� �޸𸮸� ����ϰԵȴ�.
		// ���� input() �ȿ��� �ۼ��Ͽ� �Է¹��� ����.
		// "ȭ��ǿ� ������ �� �� ����뿡 ���� Ʋ���� �ִ� ����" ��
		// "������ �Ҷ��� ���� Ʈ�� ���� ����"

		// ��, class���� BufferedReader br; �ϰ�
		// input�ȿ��� br = new BufferedReader(new InputStreamReader(System.in));
		// �� �� ���� �ٸ� �޼ҵ忡���� ����� ���� ����غ��� ������...
		// ��, �̷��Դ� �ٸ� �޼ҵ忡���� ���۸����� ���� �� ����Ѵ�.

		// Ŭ�������� �ۼ��ϴ� ���� �������̸� ���� ����!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Է� : ");
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
		System.out.printf(">> �������� %d �� ����\n", r);
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", l);
	}
	


}