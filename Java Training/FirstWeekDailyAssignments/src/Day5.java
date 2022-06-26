class Student{
	int id;
	String name;
	public void Student() {
		System.out.println("Default Constructor");
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Day5 {

	public static void main(String[] args) {
		
Student obj = new Student();
obj.setId(101);
System.out.println(obj.getId());
obj.setName("Rajiya");
System.out.println(obj.getName());

	}
}
// What happens if you keep a return type for a constructor?
// there is no return type to constructor and if we try to provide return type to constructor, it is going to converted into a method.And it is no longer constructor