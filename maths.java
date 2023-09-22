package com.ebrain.basic;

public class maths {
	
	
	public static void main(String[] args) {
		
	int A = 10;
	int B = 3;
	
	
	int C = A+B;
	int D = A-B;
	int E = A*B;
	int F = A/B; // without decimal ans
	
	float G = A/B; // without exact decimal ans
	
	float H = (float)A/(float)B; // with exact dec ans
	
	 
	System.out.println(C);
	System.out.println(D);
	System.out.println(E);
	System.out.println(F);
	System.out.println(G);
	System.out.println(H);
	
	System.out.println(A<B);
	System.out.println(A>B);
	System.out.println(A<=B);
	System.out.println(A>=B);
	System.out.println(A==B); // A equal to B 
    System.out.println(A!=B); // A Not Eq to B
    
    
    boolean a = true; 
    boolean b = false;
    boolean c = true;
    boolean d = false;
    
   // not operator (exact opposite) 
   System.out.println(!a);
   System.out.println(!b);
   
    //or operator ( if one is true = true otherwise false)
   System.out.println(a||b); // a or b
   System.out.println(a||c); // a or c
   System.out.println(b||d); // b or d
   System.out.println(b||c); // b or c
    
    // and operator if any one false = false, both true =true
   
   System.out.println(a&&b);
   System.out.println(a&&c);
   System.out.println(b&&d);
   System.out.println(b&&c);
   
   
   // prefrance like bodmas in this case is (Not,And,Or)
   
   
    
    
	}

}
