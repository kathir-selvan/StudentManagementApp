package student.usage;

public class Admin extends User {
    public Admin(String name) {
    	super (name);// super keyword derived cls use.  like parent cls method or constructor, variable invoke panna use pannalam:
    }
    @Override ///2 different cls multiple  methods but methods or same 
    public void showMenu() {
    	System.out.println("Welcome, Admin "+name);
    	System.out.println("1. Add Student");
    	System.out.println("2. View All Students");
    	System.out.println("3. update Student Maks");
        System.out.println("4. Exit");	
    }
}
