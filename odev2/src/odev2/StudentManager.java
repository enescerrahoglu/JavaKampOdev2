package odev2;

public class StudentManager {
	public void joinCourse(String courseName) {
		System.out.println(courseName + " kursuna katıldın!");
	}
	
	public void sendMessage(User user, String message) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + ", " + message + " mesajını gönderdi!");
	}
}
