package hw10Q3Abstraction;
/*
 * In JAVA only one keyword "extends"  is used  to inherit interface.Interface can be inherited 
 * by other interfaces only. interface can't inherit regular class or abstract class by the keyword 'extends". 
 *  Although from Java 1.8 a regular or abstract class can inherit one or more interface by using the 
 *  implements keyword.
 */
public interface University extends College, Hospital {

	public abstract void classSize();
	public void playGround();
	public void teacher();
	/*
	 * public University() { } Interface can not have constructor. Interface cannot
	 * be instantiated (cannot create object).
	 */
	public default void gymnasium() {
	}
	public static void library() {
	}
}