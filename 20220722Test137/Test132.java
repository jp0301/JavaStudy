/*==============================================
  ¡á¡á¡á ÀÚ¹ÙÀÇ ÁÖ¿ä(Áß¿ä) Å¬·¡½º ¡á¡á¡á
  - ÀÚ¹Ù¿¡¼­ ±âº»ÀûÀ¸·Î Á¦°øÇÏ´Â ÁÖ¿ä Å¬·¡½ºµé
  - Wrapper Å¬·¡½º
===============================================*/

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		// ºÒ°¡´É
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		
		// ºÒ°¡´É
		//long b1 = 123456789123456789;
		//System.out.println(b1);
		
		// °¡´É
		//long c1 = 123456789123456789L;
		//System.out.println(c1);

		// ºÒ°¡´É
		//long d1 = 123456789123456789123456789L;
		//System.out.println(d1);

		BigInteger a = new BigInteger("12345789123546789");
		BigInteger b = new BigInteger("12345789123546789");

		//BigInteger c = a + b;
		//System.out.println(c);
		

		// ´õÇÏ±â
		BigInteger c = a.add(b);
		System.out.println("µ¡¼À °á°ú : " + c);
		//--==>> µ¡¼À °á°ú : 24691578247093578

		// »©±â
		BigInteger d = a.subtract(b);
		System.out.println("»¬¼À °á°ú : " + d);
		//--==>> »¬¼À °á°ú : 0

		// °öÇÏ±â
		BigInteger e = a.multiply(b);
		System.out.println("°ö¼À °á°ú : " + e);
		//--==>> °ö¼À °á°ú : 152418509083086192506851072210521

		// ³ª´°¼À
		BigInteger f = a.divide(b);
		System.out.println("³ª´°¼À °á°ú : " + f);
		//--==>> »¬¼À °á°ú : 1


		// Áö¼ö½Â
		BigInteger g = new BigInteger("2");
		System.out.println("2ÀÇ 3½Â : " + g.pow(3));
		//--==>> 2ÀÇ 3½Â : 8


	}
}

// ½ÇÇà °á°ú
/*
µ¡¼À °á°ú : 24691578247093578
»¬¼À °á°ú : 0
°ö¼À °á°ú : 152418509083086192506851072210521
³ª´°¼À °á°ú : 1
2ÀÇ 3½Â : 8
°è¼ÓÇÏ·Á¸é ¾Æ¹« Å°³ª ´©¸£½Ê½Ã¿À . . .
*/