package odev2;

public class StudentManager {
	public void joinCourse(String courseName) {
		System.out.println(courseName + " kursuna kat�ld�n!");
	}
	
	public void sendMessage(User user, String message) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + ", " + message + " mesaj�n� g�nderdi!");
	}
}
