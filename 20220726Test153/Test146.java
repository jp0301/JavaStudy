/*==============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - Random Ŭ����
===============================================*/

/*
�� java.util.Random Ŭ������
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������ �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ����(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ�
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
//  3  5 12 24 31 41
//  1  2  8 36 41 42
//  4  9 12 13 22 30
//  5 10 13 14 22 40 
// 22 31 36 40 43 44
// ����Ϸ��� �ƹ� Ű�� ��������...

//�ζ� ��ȣ�� 45������ �ִ�.


import java.util.Random;
import java.util.Arrays;
class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;

	// ������
	Lotto()
	{
		num = new int[6];
	}

	//getter
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt = 0;

		retry:
		while(cnt < 6)		// 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;		// (0~44) �� ��+1�� �� 1 ~ 45

			for(int i = 0; i < cnt; i++)
			{
				if(num[i] == n)
					continue retry;
			}
			num[cnt++] = n;
		} // end while()

		// ���� �޼ҵ� ȣ��
		sorting();

	}// end start()


	/*
	// ���� �޼ҵ� ����
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
	


	// ���� �޼ҵ� ����
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

		//�⺻ 5 ����
		for(int i = 1; i<=5; i++)
		{
			//�ζ� ���� ����
			lotto.start();
			//lotto.arrSort();
			
			//��� ���
			for(int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}

	}
}
// ���� ���

/*
   4   5   6  12  25  28
   1  26  31  34  37  43
   5  11  15  19  33  34
   8   9  16  21  27  43
   1   7  14  26  34  36
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/