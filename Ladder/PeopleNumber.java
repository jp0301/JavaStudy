import java.util.*;

public class PeopleNumber {

	Scanner scan = new Scanner(System.in);
	
	int a;
	int height;
	String [] stuff;
	String [] name;
	String [] c;
	
	public void doProcess() {
		peopleNum();
		peopleName();
		scanStuff();
		scanHeight();
	}
	
	public void peopleNum() {
		System.out.print("���� �ο� ���� �Է��ϼ��� : ");
		a = scan.nextInt();
		c = new String [a];
	}
	
	public void peopleName() {
		name = new String[a];
		System.out.print("������ �̸��� �Է��ϼ��� : ");
		for(int i = 0; i < name.length; i++) {
			name[i] = scan.next();
			c[i] = name[i];
		}
		for(int i = 0; i < name.length; i++) {
			System.out.println("�̸� : " + (i + 1) + ". " + name[i]);
		}
	}
	
	public void scanStuff() {
		stuff = new String [a];
		System.out.print("��ǰ�� �Է��ϼ���: ");
		for(int i = 0; i < stuff.length; i++) {
			stuff[i] = scan.next();
		}
		for(int i = 0; i < stuff.length; i++) {
			System.out.println("��ǰ : " + (i + 1) + ". " + stuff[i]);
		}
	}
	
	public void scanHeight() {
		System.out.print("���̸� �������ּ��� : ");
		height = scan.nextInt();
	}
	
}