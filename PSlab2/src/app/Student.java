package app;

public class Student {
	
	private int Id;
	private String Name;
	private String Birthdate;
	private String Address;
	
	public Student(int Id, String Name, String BirthDate, String Address){
		this.setId(Id);
		this.setAddress(Address);
		this.setDate(BirthDate);
		this.setName(Name);
	}
	
	public void setId(int newId){
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
	
	public void setDate(String newDate){
		this.Birthdate = newDate;
	}
	
	public String getDate(){
		return this.Birthdate;
	}
	
	public void setAddress(String newAddress){
		this.Address = newAddress;
	}
	
	public String getAddress(){
		return this.Address;
	}
	
}
