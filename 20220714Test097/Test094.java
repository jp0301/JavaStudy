/*==============================
      ���� �迭 ����
    - �迭�� �迭(2���� �迭)
  ==============================*/

// �� ����
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
 A
 C B         // ������
 D E F
 J I H G     // ������
 K L M N O

����Ϸ��� �ƹ� Ű�� ��������...
*/


public class Test094
{
	public static void main(String[] args)
	{


		int[][] arr = new int[5][5];
		char ch='A';
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(i % 2 == 0) // ¦�� �� ������
				{
					arr[i][j] = ch;
				}
				else // Ȧ�� �� ������
				{
					arr[i][i-j] = ch; 
				}
				ch++;
			}
		}


		/*
		 00
		 11 10
		 22 21 20
		 33 32 31 30
		 44 43 32 41 40
		*/

		// i = 0�� �� arr[0][0-0] �� arr[0][0]    i = 1�� �� arr[1][1-0] �� arr[1][1]
		//            				             			 arr[1][1-1] �� arr[1][0]


		// �迭�� �迭 ��ü ��� ����
		for(int i=0; i< arr.length; i++)
		{	
			for(int j=0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}


	}
}