package hw9Q3Abstraction.copy;

public interface College {

	public void commonRoom();
	public void laboratoryRoom();
	public void languageClub();
	public default void dorm() {

	}
	public static void studyRoom() {

	}
}