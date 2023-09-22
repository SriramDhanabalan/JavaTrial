package com.ebrain.basic;

public class Human {
	
	public String Name;
	
	public String Fathername;
	
	public String Mothername;
	
	public Double DateofBirth;
	
	public Boolean isGraduated;
	
	public Double Monthlysalary;
	
	// Default constructor.
	public Human() {}
	
	// User Defined Constructor
	public Human (String Name, String Fathername, String Mothername, Double DateofBirth, Boolean isGraduated, Double Monthlysalary) {
		
		this.Name = Name;
	    
		this.Fathername = Fathername;
		
		this.Mothername = Mothername;
		
		this.DateofBirth = DateofBirth;
		
		this.isGraduated = isGraduated;
		
		this.Monthlysalary = Monthlysalary;
				
		
		}
	
		
	
	public static void main(String[] args) {
		
		// Default constructor
		Human Ebrainobj = new Human();
		
		Ebrainobj.Name= "Ebrain";
		
		Ebrainobj.Fathername= "Ulaganathan";
		
		Ebrainobj.DateofBirth= 11.03;
		
		Ebrainobj.Monthlysalary = 20000.00;
		
		Ebrainobj.isGraduated = true;
		
		
		//User defined Constructor
		Human UlaguObj = new Human("Ulaganathan", "Stark", "MrsStark", 11.09, true, 23000.00);
		
		
		
		
		String EbrainDetails = Ebrainobj.Name+", "+Ebrainobj.Fathername+", "+Ebrainobj.Mothername+", "+Ebrainobj.DateofBirth;
		
		
		
	    String Ulagudetails = UlaguObj.Name+","+UlaguObj.Fathername+","	+UlaguObj.Mothername+","+UlaguObj.DateofBirth+","+UlaguObj.Monthlysalary;
	    
	    
	    
			
	
				System.out.println(EbrainDetails);
				
				System.out.println(Ulagudetails);
		
		
		
	
	
	}

}
