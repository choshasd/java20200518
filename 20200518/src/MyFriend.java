// �� Ŭ������ �ȳְ� ������ �θ�Ŭ������ �����
class Friend{
	protected String name;
	protected String phone;
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public void showInfo() {
		System.out.println("�̸� = "+this.name);
		System.out.println("��ȣ = "+this.phone);
	}
}
class UniFriend extends Friend{	
	private String major;
	public UniFriend(String name, String major, String phone) {
		super(name, phone);
		this.major = major;
	}
	public void showInfo() {
		System.out.println("�̸� = "+this.name);
		System.out.println("���� = "+this.major);
		System.out.println("��ȣ = "+this.phone);
	}	
}
class WorkFriend extends Friend{
	
	private String part;
	
	public WorkFriend(String name, String part, String phone) {
		super(name, phone);
		this.part = part;
	}
	public void showInfo(){
		System.out.println("�̸� = "+this.name);
		System.out.println("�μ� = "+this.part);
		System.out.println("��ȣ = "+this.phone);
	}
	
}
public class MyFriend {
	public static void main(String[] args) {
		Friend[] frd = new Friend[10];
		int fcnt =0;
		
		
		frd[fcnt++] = new UniFriend("ȫ�浿","��ǻ��","123");
		frd[fcnt++] = new UniFriend("��浿","���ڰ�","456");
		frd[fcnt++] = new WorkFriend("��̿�","R&D","111");
		frd[fcnt++] = new WorkFriend("�ֵ���","R&D","112");
		
		for(int i = 0;i<fcnt;i++) {
			frd[i].showInfo();
			System.out.println();
		}
		
		/*
		UniFriend[] unif = new UniFriend[5];
//		unif[0] = new UniFriend("aaa","bbb","0");
		int ucnt = 0;
		unif[ucnt++] = new UniFriend("ȫ�浿","��ǻ��","123");
	
		WorkFriend[] workf=new WorkFriend[5];
		int wcnt = 0;
		workf[wcnt++] = new WorkFriend("����","IT","456");
		
		for(UniFriend uni : unif) {
			if(uni != null) {
				System.out.println("[ ����ģ�� ]");
				uni.showInfo();
				System.out.println();
			}
		}
		for(WorkFriend wf : workf) {
			if(wf != null) {
				System.out.println("[ ȸ�絿�� ]");
				wf.showInfo();
				System.out.println();
			}
		}
		*/
	}
}
