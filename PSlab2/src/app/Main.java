package app;

public class Main {

	public static void main(String[] args) {
		
		Control control = new Control();
		control.createStudentTable();
		Student stud1 = new Student(1, "Abraham Gellert", "01.08.1995","Tereda nr30");
		control.insertStudent(stud1);
		Student stud2 = new Student(2, "Chuck Norris", "01.08.1895","Baritiu nr30");
		control.insertStudent(stud2);
		Student stud3 = new Student(3, "Tirion Lannister", "01.08.1795","Titulescu nr30");
		control.insertStudent(stud3);
		
		control.updateStudent(3, "Chuck Norris", "00.00.0000", "Neben Strasse nr30");
		
		control.createCoursesTable();
		
		Course c1 = new Course(1, "SD", "Vasile", 3);
		control.insertCourse(c1);
		Course c2 = new Course(2, "IP", "Anca", 3);
		control.insertCourse(c2);
		Course c3 = new Course(3, "SE", "Todoran", 2);
		control.insertCourse(c3);
		
		control.createEnrollTable();
		
		control.insertEnroll(1, 3, 1);
		control.insertEnroll(2, 3, 2);
		control.insertEnroll(3, 2, 2);
		
	}

}
