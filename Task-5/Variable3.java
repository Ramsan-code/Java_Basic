// Task 5: Declaring Multiple Variable

// Objective: Learn to declare multiple variables of the same data type in one line and print them together using concatenation.

class Variable3 {
	public static void main (String args[]){
		String fname, lname;
		fname = "Ramsan";
		lname = "Thaventhiran";
		
		System.out.println("First Name: "+ fname);
		System.out.println("Last Name: "+ lname);
		System.out.println("Full Name: " + fname + " "+ lname);
	}
}

//output:
// javac Variable3.java
//java Variable3
//First Name: Ramsan
//Last Name: Thaventhiran
//Full Name: Ramsan Thaventhiran
