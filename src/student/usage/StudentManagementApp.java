package student.usage;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Admin admin = new Admin("Psycho~");
        ArrayList<Student> studentList = new ArrayList<>();
	    
        
        while(true) {
        	admin.showMenu();
        	System.out.println("Enter Ur Choice: ");
        	int choice = s.nextInt();
        	s.nextLine();
        	
        
        	switch(choice) {
        	case 1:
        		System.out.println("Enter  Student ID:");
        		int id = s.nextInt();
        		s.nextLine();
        		System.out.println("Enter Student Name: ");
        		String name = s.nextLine();
        		
        		System.out.println("Enter Student Marks:");
        		int marks = s.nextInt();
        		studentList.add(new Student(id, name, marks));
        		System.out.println("Student Details Added Succesfully~~~~~~~!");
        		
        		break;
        		
        	case 2:
        		if(studentList.isEmpty()) {
        			System.out.println("No Student Details Found");
        			
        		}
        		else {
        			for(Student st: studentList)
        				st.display();
        		}
        		break;
        		
        	case 3:
        		System.out.println("Enter Studen ID to Update ");
        		int searchId = s.nextInt();
        		boolean found = false;
        		for (Student st: studentList) {
        			if (st.getId() == searchId) {
        				System.out.println("Enter New Marks");
        				int newMarks = s.nextInt();
        				st.setMarks(newMarks);
        				System.out.println("Marks Upadted");
        				found = true;
        				break;
        			}
        		}
        		if (!found) {
        			System.out.println("Student not found!!");
        		}
        		break;
        		
        	case 4:
        		System.out.println("Exit Successfuly!!!!----------");
        		System.exit(0);
        		break;
        		
        	default:
        		System.out.println("Invalid choice");
        	}
        	
        }
        
	}

}
