package student.usage;

public class Student {
    private int id;//encapsulation
    private String name;
    private int marks;
    
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
    public int getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    public int getMarks() {
    	return marks;
    }
    
    public void  setMarks(int marks) {
    	this.marks = marks;
    }
    
    public String getGrade() {
    	if (marks >= 90) return "A+";
    	else if (marks >= 75) return "A";
    	else if  (marks >=60) return "B";
    	else if (marks >= 50) return "C";
    	else 	return "RA";
    }
    
    
    public void display() {
    	System.out.println("ID: " +id +", NAME: "+name + ",    MARKS: "+marks+",   Grade: "+getGrade());
    }
}
