package hw9Q3Abstraction.copy;
/*
 * In JAVA only one keyword "extends"  is used  to inherit interface. Interface can be inherited by other interfaces only. 
 * interface can't inherit regular class or abstract class by the keyword 'extends" . Unlike Class & Abstract Class, 
 * one interface can inherit to more than one interfaces in Java.
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