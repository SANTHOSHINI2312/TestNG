package Selepack;

public class Singleton {
	public static Singleton b=null;
	private Singleton() {}
	public static Singleton method() {
		if(b==null) {
			b= new Singleton();
		}
		return b;
	}
	
public static void main(String[] args) {
	Singleton a=method();
	Singleton ss=method();
	Singleton vv=method();
	Singleton ll=method();
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(ss));
	System.out.println(System.identityHashCode(vv));
	System.out.println(System.identityHashCode(ll));
	
}

}
