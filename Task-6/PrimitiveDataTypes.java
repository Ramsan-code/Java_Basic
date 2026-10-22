//Topic: Data Types

//Task 6:Using Primitive Type Data Type 

//Objective: Learn how to declare,initialize,and display diffrent primitive data types 

class PrimitiveDataTypes{
	public static void main(String args[]){
		Byte b1;
		b1= 12;
		System.out.println("Byte: "+b1);
		
		Short s1;
		s1= 32000;
		System.out.println("Short: "+s1);
		
		int i;
		i=65022;
		System.out.println("Int: "+i);
		
		long l;
		l=650226558656L;
		System.out.println("long: "+ 1);
		
		float f1;
		f1= 25.6f;
		System.out.println("Float:"+f1);
		
		double db;
		db=86.35D;
		System.out.println("double: "+db);
		
		boolean bool;
		bool=true;
		System.out.println("Boolean: "+bool);
		
		char ch;
		ch='A';
		System.out.println("char: "+ch);
		
		char ch1;
		ch1=65;      //decimal  value
		System.out.println("Char: "+ch1);
		
		char ch2;
		ch2=0101;    //octal value
		System.out.println("Char: "+ch2);
		
		char ch3;
		ch3=0x41;    //Hexa decimal value
		
		char ch4;
		ch4=0b1000001;   //binary value
		System.out.println("char: "+ch3);
		
		char ch5;
		ch5='\u0041';     //Unicode value
		System.out.println("char: "+ch5);
	}
}
/*\Yarl_IT\Java_Basic\Task-6>java PrimitiveDataTypes
Byte: 12
Short: 32000
Int: 65022
long: 1
Float:25.6
double: 86.35
Boolean: true
char: A
Char: A
Char: A
char: A
char: A
*/
