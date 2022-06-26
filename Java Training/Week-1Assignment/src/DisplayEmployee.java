enum Employee{
	 HR,DEVELOPER,TESTING,DEVOPS,ADMIN;
	}
public class DisplayEmployee {
     public static void main(String[] args) {
		
		Employee e1 = Employee.HR;
		System.out.println(e1);
		switch(e1) {
		case HR:
			System.out.println("Hi,this Employee is HR");
			break;
		case DEVELOPER:
			System.out.println("Hi,this Employee is DEVELOPER");
			break;
		case TESTING:
			System.out.println("Hi,this Employee is TESTING");
			break;
		case DEVOPS:
			System.out.println("Hi,this Employee is DEVOPS");
			break;
		case ADMIN:
			System.out.println("Hi,this Employee is ADMIN");
			break;
		default:
			System.out.println("Please enter a Valid Employee");
			break;
			
		}
	}

}
