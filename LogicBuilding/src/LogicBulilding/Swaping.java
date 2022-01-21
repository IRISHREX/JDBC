package LogicBulilding;

public class Swaping {
	static int a= 20,b=30;
	
	void FirstApproch() {
		System.out.println("1st approch");
	System.out.println("before swaping:" +a+" "+b);
	int t=a;
	a=b;
	b=t;
	System.out.println("After swaping:" +a+" "+b);
	}
	void SecondApproch() {
		System.out.println("2nd approch");
		System.out.println("before swaping:" +a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping:" +a+" "+b);
	}
		
	

	public static void main(String[] args) {
		Swaping obj=new Swaping();
		obj.FirstApproch();
		obj.SecondApproch();
		
	
		
	}

}
