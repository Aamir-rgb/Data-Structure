
public class Singleton {
	
	private Singleton() {
		
	}
	private static Singleton s;
	
	public Singleton getObject() {
		return s = new Singleton();
	}
	

}
