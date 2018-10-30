package lesson7.lecture.singletons;

/** Threadsafe singleton implementation; eager initialization */
public enum MySingletonEnum {
	INSTANCE;
//	public static final MySingletonEnum INSTANCE= new MySingleton();
//	private MySingletonEnum() {
//		System.out.println("singleton");
//	}
	public void behavoir() {
		System.out.println("Redae");
	}
}
