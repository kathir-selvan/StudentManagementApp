package student.usage;

abstract public class User {
	String name;
	
	public User(String name) {
		this.name = name;
	}
	
	
	public abstract void showMenu();
   
}
