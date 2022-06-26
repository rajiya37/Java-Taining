import java.util.*;

class UserInformation{
	private String id;
	private String firstName;
	private String lastName;
	private String department;
	private String gender;
	private String address;
	private int age;
	private int salary;
	  public String getId() {
        return id;
    }
 public void setId(String id) {
        this.id = id;
    }
    public String getfirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
  public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
        }
public String getAddress() {
return address;
        }
public void setAddress(String address) {
this.address=address;
}
 public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

 public int getSalary() {
return salary;
}

public void setSalary(int salary) {
this.salary = salary;
}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		UserInformation obj = new UserInformation();
		System.out.println("   "+"Employee Details");
		obj.setId("IIT/EMP/2720");
		System.out.println("Id:"+" "+obj.getId());
		obj.setFirstName("Shaik");
		System.out.println("FirstName:"+" "+obj.getfirstName());
		obj.setLastName("Rajiya Begum");
		System.out.println("LastName:"+" "+obj.getLastName());
		obj.setDepartment("Development");
		System.out.println("Department:"+" "+obj.getDepartment());
		obj.setGender("Female");
		System.out.println("Gender:"+" "+obj.getGender());
		obj.setAddress("BTM Layout,Bangalore");
		System.out.println("Address:"+" "+obj.getAddress());
		obj.setAge(23);
		System.out.println("Age:"+" "+obj.getAge());
		obj.setSalary(25000);
		System.out.println("Salary:"+" "+obj.getSalary());
		
		System.out.println("  "+" Available plans ");
		boolean b=true;
		if(b) {
		System.out.println("Insurance Plans");       
		System.out.println("Retirement Plans");        
		System.out.println("Performance Bonus");           
		System.out.println("Employee Training");
		}else {
			System.out.println("No-Plans");
		}
		
	
	}

}