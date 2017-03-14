package app;

public class Course {

	private int Id;
	private String Name;
	private String Teacher;
	private int Year;
	
	public Course(int Id, String Name, String Teacher, int Year){
		this.setId(Id);
		this.setName(Name);
		this.setTeacher(Teacher);
		this.setYear(Year);
	}
	
	public void setId (int newId){
		this.Id = newId;
	}
	
	public int getId(){
		return this.Id;
	}
	
	public void setName(String newName){
		this.Name = newName;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public void setTeacher(String newTeacher){
		this.Teacher = newTeacher;
	}
	
	public String getTeacher(){
		return this.Teacher;
	}
	
	public void setYear(int newYear){
		this.Year = newYear;
	}
	
	public int getYear(){
		return this.Year;
	}
	
}
