/*=============================================
    ���� ���� �帧�� ��Ʈ��(�ݺ���) ����
	 - �ݺ��� (do~while��) �ǽ�
  ============================================*/

// ����ڷκ��� ���� ���� ���� ������ �Է¹ް�,
// �� ���� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, -1 �� �ԷµǴ� ���� �Է� ������ �����ϰ�
// �׵��� �Էµ� ������ ���� ������ִ� ���α׷��� �����Ѵ�.
// ��, -1 �� �Է� ���� Ŀ�ǵ�� Ȱ���Ѵ�.
// do~while ���� Ȱ���Ͽ� ������ �ذ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// 1��° ���� �Է�(-1 ����) : 10
// 2��° ���� �Է�(-1 ����) : 5
// 3��° ���� �Է�(-1 ����) : 8
// 4��° ���� �Է�(-1 ����) : -1

// >> ������� �Էµ� ������ �� : 32
// ����Ϸ��� �ƹ� Ű�� ��������...


//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args) throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		int count = 1;
		
		
		do
		{
			System.out.print( count + "��° ���� �Է�(-1 ����) : ");
			num = sc.nextInt();

			if(num != -1)
			{
				sum += num;
			}
			else
				break;

			count++;
		}
		while(true);

		System.out.println("\n>> ������� �Էµ� ������ �� : " + sum);
		*/



		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;				//-- ������� �Է°��� ��Ƴ� ����
		int sum=0;				//-- �������� ��Ƴ� ����
		int n=1;				//-- ���� ������ Ȱ���ϸ� �� ��° �Է°������� ��Ƴ� ����


		// ���� �� ó��

		do
		{
			System.out.printf(" %d��° ���� �Է�(-1 ����) : ", n);
			num = Integer.parseInt(br.readLine());
			
			sum += num;			//-- sum�� num��ŭ �������Ѷ�~!!!

			n++;
		}
		while (num != -1);		//-- num�� -1�� �ƴ� ��� (����ؼ� �ݺ�)

		// ��� ���
		System.out.println("\n>> ������� �Էµ� ������ �� : " + (sum+1));

	}
}

// ���� ���

/*
1��° ���� �Է�(-1 ����) : 10
2��° ���� �Է�(-1 ����) : 10
3��° ���� �Է�(-1 ����) : 11
4��° ���� �Է�(-1 ����) : -1

>> ������� �Էµ� ������ �� : 31
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/