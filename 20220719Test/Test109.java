/*=========================================
      ���� ����(Sort) �˰��� ����
  =========================================*/

// ���� ���� ����(Bubble Sort)

//  �� �տ��� �� Selection Sort(Test107) �� Bubble Sort(Test108) �� ������ ����.
//     (�� ������ ���� �ٰ� : �ݺ����� ������ Ƚ��)
//     ������, ���� Bubble Sort �� ��� �������� ������ ����
//     �Ϲ� Bubble Sort �� Selection Sort �� ���� ������ ���� �� �ִ�.

// ���� ������ : 61 15 20 22 30
//				 15 20 22 30 61 - 1ȸ�� (���� �߻� �� true)  �� ���� ȸ�� ���� ��
//				 15 20 22 30 61 - 2ȸ�� (���� �߻� �� false) �� ���� ȸ�� ���� ��

//== 1ȸ�� ����... 2ȸ�� ����... �� �غ��Ҵ���...
//   2ȸ������ ����(�ڸ��ٲ�)�� ���� �Ͼ�� �ʾұ� ������
//   ���ʿ��� �߰� ����(�� �̻��� ȸ��)�� ���ǹ��� ������ �Ǵ��Ͽ�
//   �������� �ʴ´�.


// ���� ��)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50
// ����Ϸ��� �ƹ� Ű�� ��������...


public class Test109
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};	

		/*
		10 50 20 30 40
		== --

		10 20 50 30 40
		   == --

		10 20 30 50 40
		      == --

		10 20 30 40 50
		         == --
		------------------- 1ȸ�� �� ���� �߻�
		
		10 20 30 40 50
		== --

		10 20 30 40 50
		   == --

		10 20 30 40 50
		      == --
		-------------------- 2ȸ��  �� ���� �߻����� ����
			��
			��
		-------------------- 3ȸ��  �� ��
			��
		-------------------- 4ȸ��  �� ��
		*/


		System.out.print("Sorted Data : ");
		for(int item : a)
			System.out.print(item + " ");
		System.out.println();


		/*
		// ���� Bubble Sort ����
		boolean swapCheck;

		for(int i=1; i< a.length; i++)
		{
			swapCheck = false;

			for(int j=0; j < a.length - i; j++)
			{
				//���� �� ��� Ȯ��
				System.out.println("�ٲٱ� �� : " + a[j] + " " + a[j+1]);

				if(a[j] > a[j+1]) 
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];

					//���� �� ��� Ȯ�� 
					System.out.println(">> �ٲ� �� : " + a[j] + " " + a[j+1]);

					swapCheck = true;
				}
			}

			if(swapCheck == true)
				break;
		}
		*/
		


		// ���� Bubble Sort ����
		boolean flag;
		int pass = 0;

		do
		{
			flag = false;
			pass++;

			for(int i = 0; i < a.length - pass; i++)
			{
				if(a[i] > a[i+1])
				{
					// �ڸ� �ٲ�
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					flag = true;
					//-- �� �ѹ��̶� ������ �߻��ϰ� �Ǹ�
					//   flag ������ true�� ����~!!!
				}
			}
		}
		while (flag == false);
		//-- flag ������ false ��� ����
		//   ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
		//   �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����~!!!
		
		System.out.print("Sorted Data : ");
		for(int item : a)
			System.out.print(item + " ");
		System.out.println();
	

	}
}

// ���� ���
/*
Sorted Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/