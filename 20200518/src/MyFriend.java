// 각 클래스에 안넣고 공통의 부모클래스로 만들기
class Friend{
	protected String name;
	protected String phone;
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public void showInfo() {
		System.out.println("이름 = "+this.name);
		System.out.println("번호 = "+this.phone);
	}
}
class UniFriend extends Friend{	
	private String major;
	public UniFriend(String name, String major, String phone) {
		super(name, phone);
		this.major = major;
	}
	public void showInfo() {
		System.out.println("이름 = "+this.name);
		System.out.println("전공 = "+this.major);
		System.out.println("번호 = "+this.phone);
	}	
}
class WorkFriend extends Friend{
	
	private String part;
	
	public WorkFriend(String name, String part, String phone) {
		super(name, phone);
		this.part = part;
	}
	public void showInfo(){
		System.out.println("이름 = "+this.name);
		System.out.println("부서 = "+this.part);
		System.out.println("번호 = "+this.phone);
	}
	
}
public class MyFriend {
	public static void main(String[] args) {
		Friend[] frd = new Friend[10];
		int fcnt =0;
		
		
		frd[fcnt++] = new UniFriend("홍길동","컴퓨터","123");
		frd[fcnt++] = new UniFriend("김길동","기자공","456");
		frd[fcnt++] = new WorkFriend("김미영","R&D","111");
		frd[fcnt++] = new WorkFriend("최동수","R&D","112");
		
		for(int i = 0;i<fcnt;i++) {
			frd[i].showInfo();
			System.out.println();
		}
		
		/*
		UniFriend[] unif = new UniFriend[5];
//		unif[0] = new UniFriend("aaa","bbb","0");
		int ucnt = 0;
		unif[ucnt++] = new UniFriend("홍길동","컴퓨터","123");
	
		WorkFriend[] workf=new WorkFriend[5];
		int wcnt = 0;
		workf[wcnt++] = new WorkFriend("김김김","IT","456");
		
		for(UniFriend uni : unif) {
			if(uni != null) {
				System.out.println("[ 대학친구 ]");
				uni.showInfo();
				System.out.println();
			}
		}
		for(WorkFriend wf : workf) {
			if(wf != null) {
				System.out.println("[ 회사동료 ]");
				wf.showInfo();
				System.out.println();
			}
		}
		*/
	}
}
