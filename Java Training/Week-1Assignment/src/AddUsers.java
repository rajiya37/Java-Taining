import java.util.Arrays;

public class AddUsers {

	public static void main(String[] args) {
		String[] users= new String[5];
         users[0]="Netflix";        
	     users[1]="Amazon Prime";
         users[2]="Hotstar";
           System.out.println("Original Users"+Arrays.toString(users));          
           int n =3;                                                        
           String s = "Zee5";                                              
           String s1 = "Ahaa";                                             
           users[n++]=s;                                                     
           users[n++]=s1;                                                    
           System.out.println("Adding Users:"+Arrays.toString(users));
          	String[] emps= new String[5];                                                                                                                           
            emps[0]="Tarun Khandelwal";                                                                                                                    
           emps[1]="Manjunatha Swamy";                                                                                                               
            emps[2]="Manoj Sharma";                                            
              System.out.println("Original Emps"+Arrays.toString(emps)); 
              int n1 =3;                                                    
              String s2 = "Shaik";                                           
              String s3= "Rajiya Begum";                                          
              emps[n1++]=s2;                                                
              emps[n1++]=s3;                                               
              System.out.println("Adding Emps:"+Arrays.toString(emps));  
              String[] plans= new String[5];                                  
              plans[0]="Insurance Plans";                                            
              plans[1]="Perfomance Bonus";                                       
              plans[2]="Retirement Plans";                                            
                System.out.println("Original Plans"+Arrays.toString(plans)); 
                int n3 =3;                                                    
                String s4 = "Employee Training";                                           
                String s5 = "PF Account";                                          
                plans[n3++]=s4;                                                
                plans[n3++]=s5;                                               
                System.out.println("Adding Plans:"+Arrays.toString(plans));  }}