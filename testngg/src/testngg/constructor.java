package testngg;

public class constructor {

	int empId;  
	   String empName;  
	   
   
	   //parameterized constructor with two parameters
	   constructor(int id, String name){  
	      empId = id;  
	   empName = name;  
	   }  
	   
	   constructor(){
		   
		   System.out.println("simple");
	   }
		 
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  
		   
	   public static void main(String args[]){  
		   constructor obj1 = new constructor(10245,"Chaitanya");  
		   constructor obj2 = new constructor(92232,"Negan");  
		   constructor obj23 = new constructor();  
		obj1.info();  
		obj2.info();  
	   }  
	}