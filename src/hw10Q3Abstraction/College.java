package hw10Q3Abstraction;

public interface College {

	public void commonRoom();
	public void laboratoryRoom();
	public void languageClub();
	public default void dorm() {

	}
	public static void studyRoom() {

	}
}