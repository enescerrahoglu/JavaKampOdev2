package odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@engin.com");
		instructor.setPassword("12345");
		instructor.setBiography("MCT, PMP ve ITIL sertifikasyonlarýna sahibim :D");
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Enes");
		student.setLastName("Cerrahoðlu");
		student.setEmail("enes@enes.com");
		student.setPassword("98765");
		
		UserManager userManager = new UserManager();
		userManager.login(instructor, instructor.getEmail(), instructor.getPassword());
		System.out.println(instructor.getBiography());
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		userManager.logout(instructor);
		
		System.out.print("\n");
		
		userManager.login(student, student.getEmail(), student.getPassword());
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		student.setMessage("\"Hocam, tüm ödevleri tamamladým!\"");
		studentManager.sendMessage(student, student.getMessage());
		userManager.logout(student);
		
	}

}
