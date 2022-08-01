

public class Output
{
	public static void mainLogo()
	{
		System.out.println("\t\t\t==========================================");
		System.out.println("\t\t\t\"¿À´Ã Á¡½É ¹¹ ¸ÔÁö?\" with ½Ö¿ë°­ºÏ±³À°¼¾ÅÍ");	
		System.out.println("\t\t\t==========================================");
	}

	public static void startMenu()
	{
		System.out.print("\t\t\t¦£");
		for(int i = 0; i < 39; i++) System.out.print("¦¡");
		System.out.print("¦¤\n");
		
		System.out.println("\t\t\t¦¢             1. ¿À´ÃÀÇ ÃßÃµ            ¦¢");
		System.out.println("\t\t\t¦¢             2. À½½ÄÁ¡ ¿¹¾à            ¦¢");
		System.out.println("\t\t\t¦¢             3. °ÔÀÓ                   ¦¢");
        System.out.println("\t\t\t¦¢             4. Á¾·á                   ¦¢");
		System.out.print("\t\t\t¦¦");
		for(int i = 0; i < 39; i++) System.out.print("¦¡");
		System.out.print("¦¥\n");
	}



}