
import java.util.*;



public class LadderMain
{
	Scanner scan = new Scanner(System.in);
	PeopleNumber pn = new PeopleNumber();
	DrawLadder dl = new DrawLadder();
	RedrawLadder2 rl2 = new RedrawLadder2();
	
	public LadderMain() {
		doProcess();
	}
	
	public void doProcess() {
		//������ �ο��� �޴´�(��ǰ�� ���� ���Ѵ�.)
		pn.doProcess();
		//��ٸ��� �׸���.
		dl.drawLadder(pn.a, pn.height, pn.stuff);

		//�ܼ�â�� �ʱ�ȭ�Ѵ�.
		nullPoint();
		rl2.redrawLadder(pn.a, pn.height, pn.stuff, pn.name, pn.c);
	}
	
	public void nullPoint() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}



	public static void main(String[] args)
	{
		new LadderMain();
	}

}