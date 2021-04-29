package odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setEmail("engin@engin.com");
		instructor.setPassword("12345");
		instructor.setBiography("MCT, PMP ve ITIL sertifikasyonlar�na sahibim :D");
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Enes");
		student.setLastName("Cerraho�lu");
		student.setEmail("enes@enes.com");
		student.setPassword("98765");
		
		UserManager userManager = new UserManager();
		userManager.login(instructor, instructor.getEmail(), instructor.getPassword());
		System.out.println(instructor.getBiography());
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		userManager.logout(instructor);
		
		System.out.print("\n");
		
		userManager.login(student, student.getEmail(), student.getPassword());
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		student.setMessage("\"Hocam, t�m �devleri tamamlad�m!\"");
		studentManager.sendMessage(student, student.getMessage());
		userManager.logout(student);
		
	}

}
