package CreationalPattern;
class Singleton {
	private Singleton() {
		System.out.println("in ctor of B");
	}
	private static Singleton obj;
	static Singleton getObj() {
		if(obj==null)obj = new Singleton();
		return obj;
	}
	void sayHello(){
		System.out.println("hello");
	}
	void sayHi(){
		System.out.println("hi");
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getObj();
		s1.sayHello();
		Singleton s2 = Singleton.getObj();
		s2.sayHi();
	}
}
