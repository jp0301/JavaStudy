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
 B C
 D E F
 G H I J
 K L M N O
 
����Ϸ��� �ƹ� Ű�� ��������...
*/

/*
00
10 11
20 21 22
30 31 32 33
40 41 42 43 44
*/


public class Test093
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		char ch='A';
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				arr[i][j] = ch;
				ch++;

			}
		}



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