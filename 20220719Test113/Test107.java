/*=========================================
      ���� ����(Sort) �˰����� ����
  =========================================*/

/*
�� ����
   : �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
     �� ���� ����... �˻��ϱ� ����

   �� ���ҽ� �Ҹ� ������ ���� �۾�, �ý��� ���ϰ� ���ϴ�.

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����, ..........

*/

// ���� ����(Selection Sort)


// ���� ��)
// Source Dara : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// ����Ϸ��� �ƹ� Ű�� ��������....

public class Test107
{
	public static void main(String[] args)
	{
		// int[] a = {52, 42, 12, 62, 60};
		/*
		52, 42, 12, 62, 60
		==  --
		
		42, 52, 12, 62, 60
		==      -- 

		12, 52, 42, 62, 60
		==      --
		
		12, 52, 42, 62, 60
		==          --
		
		12, 52, 42, 62, 60
		==              --
		
		----------------------------- 1ȸ�� (��~)

		12, 52, 42, 62, 60
		    ==  --  
		12, 42, 52, 62, 60
		    ==      --
		12, 42, 52, 62, 60
		    ==          --
	    ------------------------------ 2ȸ�� (��~)
		12, 42, 52, 62, 60     2   3
		        ==  --
		12, 42, 52, 62, 60     2   4
		        ==      --
		-------------------------------------3ȸ��  
		12, 42, 52, 60, 62     3   4
		            ==  --
		-------------------------------------4ȸ�� 

		*/


		int[] a = {52, 42, 12, 62, 60};
		int temp = 0;


		System.out.print("Source Data : ");
		/*
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		//--==>> Source Data : 52 42 12 62 60


		// ���� for��(for-each ����)
		for (int item : a)
			System.out.print(n + " ");
		System.out.println();

		


		// Selection sort
		for(int i=0; i < a.length; i++)			// ������ ����ִ� ����
		{										// ��~~~~ �� �񱳱��ص����� (0 1 2 3)
			for(int j=i+1; j < a.length; j++)	// ������~ �� �񱳴������
			{
				if(a[i] > a[j])     //-- ��������
				//if (a[i] < a[j])  //-- ��������
				{
					/*
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					*/

					//�ڸ� �ٲٱ�
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
					
				}
			}
		}


		System.out.print("Sorted Data : ");
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>> Sorted Data : 12 42 52 60 62
	}
}

// ���� ���
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/